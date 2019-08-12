package entity;

import enums.CityType;
import enums.FoodType;
import enums.TourType;
import enums.TransportType;

/**
 *
 * @author Misha Kolesnik
 * @date 12.08.2019
 *
 * Abstract Class provides entity of all tours
 *
 */

public abstract class Tour {

    private TourType tour;
    private Integer dayNumber;
    private TransportType transport;
    private FoodType food;
    private CityType city;

    public TourType getTour() {
        return tour;
    }

    public void setTour(TourType tour) {
        this.tour = tour;
    }

    public Integer getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(Integer dayNumber) {
        this.dayNumber = dayNumber;
    }


    public TransportType getTransport() {
        return transport;
    }

    public void setTransport(TransportType transport) {
        this.transport = transport;
    }

    public FoodType getFood() {
        return food;
    }

    public void setFood(FoodType food) {
        this.food = food;
    }

    public CityType getCity() {
        return city;
    }

    public void setCity(CityType city) {
        this.city = city;
    }

    public Tour() {

    }

    public Tour(TourType tour, Integer dayNumber, TransportType transport, FoodType food, CityType city) {

        this.tour = tour;
        this.dayNumber = dayNumber;
        this.food = food;
        this.transport = transport;
        this.city = city;

    }

}
