package entity;

import entity.enums.*;

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

}
