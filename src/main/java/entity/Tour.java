package entity;

import entity.enums.FoodType;
import entity.enums.TourType;
import entity.enums.TransportType;

public abstract class Tour {

    private TourType tour;
    private int dayNumber;
    private int cost;
    private TransportType transport;
    private FoodType food;
    private String city;

    public Tour(TourType tour, int dayNumber, int cost, TransportType transport, FoodType food, String city) {

        this.tour = tour;
        this.dayNumber = dayNumber;
        this.cost = cost;
        this.food = food;
        this.transport = transport;
        this.city = city;

    }

}
