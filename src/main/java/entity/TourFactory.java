package entity;

import entity.enums.FoodType;
import entity.enums.TourType;
import entity.enums.TransportType;

public class TourFactory {

    public Tour getTour(TourType tourType) {

        Tour toReturn = null;
        switch (tourType) {
            case SHOPPING1:
                toReturn = new ShoppingTour(tourType, 3, 50, TransportType.BUS, FoodType.RO);
                break;
            default: break;
        }

        return toReturn;

    }

}
