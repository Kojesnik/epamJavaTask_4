package entity;

import entity.enums.ExcursionType;
import entity.enums.FoodType;
import entity.enums.TourType;
import entity.enums.TransportType;

public class ExcursionTour extends Tour {

    private ExcursionType excursionType;

    public ExcursionTour(TourType tour, int dayNumber, int cost, TransportType transport, FoodType food, String city, ExcursionType excursionType) {

        super(tour, dayNumber, cost, transport, food, city);
        this.excursionType = excursionType;

    }

}
