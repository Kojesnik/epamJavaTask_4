package entity;

import enums.*;

/**
 *
 * @author Misha Kolesnik
 * @date 12.08.2019
 *
 * Class provides entity of rest tour
 *
 */

public class RestTour extends Tour {

    public HotelType getHotelType() {
        return hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }

    private HotelType hotelType;

    public RestTour() {

    }

    public RestTour(TourType tour, Integer dayNumber, TransportType transport, FoodType food, CityType city, HotelType hotelType) {

        super(tour, dayNumber, transport, food, city);
        this.hotelType = hotelType;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestTour restTour = (RestTour) obj;
        if ((getTour() == restTour.getTour()) && (getDayNumber() == restTour.getDayNumber()) &&
                (getTransport() == restTour.getTransport()) &&
                (getFood() == restTour.getFood()) && (getCity() == restTour.getCity()) &&
                (getHotelType() == restTour.hotelType)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getDayNumber() * 100;
    }

    @Override
    public String toString() {
        return "RestTour [HotelType " + hotelType + ", TourType " + getTour() + ", DayNumber " + getDayNumber() + ", TransportType "
                + getTransport() + ", FoodType " + getFood() + ", City " + getCity() + " ]";
    }

}
