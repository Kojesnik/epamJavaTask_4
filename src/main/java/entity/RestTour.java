package entity;

import entity.enums.FoodType;
import entity.enums.HotelType;
import entity.enums.TourType;
import entity.enums.TransportType;

public class RestTour extends Tour {

    private HotelType hotelType;

    public RestTour(TourType tour, int dayNumber, int cost, TransportType transport, FoodType food, String city, HotelType hotelType) {

        super(tour, dayNumber, cost, transport, food, city);
        this.hotelType = hotelType;

    }

}
