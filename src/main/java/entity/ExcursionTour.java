package entity;

import entity.enums.*;

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

}
