package entity;

import entity.enums.FoodType;
import entity.enums.ShopType;
import entity.enums.TourType;
import entity.enums.TransportType;

public class ShoppingTour extends Tour {

    private ShopType shopType;

    public ShoppingTour(TourType tour, int dayNumber, int cost, TransportType transport, FoodType food, String city, ShopType shopType) {

        super(tour, dayNumber, cost, transport, food, city);
        this.shopType = shopType;

    }

}
