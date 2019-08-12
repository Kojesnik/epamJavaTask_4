package entity;

import enums.*;

/**
 *
 * @author Misha Kolesnik
 * @date 12.08.2019
 *
 * Class provides entity of excursion tour
 *
 */

public class ExcursionTour extends Tour {

    public ExcursionType getExcursionType() {
        return excursionType;
    }

    public void setExcursionType(ExcursionType excursionType) {
        this.excursionType = excursionType;
    }

    private ExcursionType excursionType;

    public ExcursionTour() {

    }

    public ExcursionTour(TourType tour, Integer dayNumber, TransportType transport, FoodType food, CityType city, ExcursionType excursionType) {

        super(tour, dayNumber, transport, food, city);
        this.excursionType = excursionType;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExcursionTour excursionTour = (ExcursionTour) obj;
        if ((getTour() == excursionTour.getTour()) && (getDayNumber() == excursionTour.getDayNumber()) &&
                (getTransport() == excursionTour.getTransport()) &&
                (getFood() == excursionTour.getFood()) && (getCity() == excursionTour.getCity()) &&
                (getExcursionType() == excursionTour.excursionType)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getDayNumber() * 1000;
    }

    @Override
    public String toString() {
        return "ExcursionTour [ExcursionType " + excursionType + ", TourType " + getTour() + ", DayNumber " + getDayNumber() + ", TransportType "
                + getTransport() + ", FoodType " + getFood() + ", City " + getCity() + " ]";
    }

}
