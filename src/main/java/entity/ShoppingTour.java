package entity;

import entity.enums.*;

public class ShoppingTour extends Tour {

    private ShopType shopType;

    public ShopType getShopType() {
        return shopType;
    }

    public void setShopType(ShopType shopType) {
        this.shopType = shopType;
    }

    public ShoppingTour() {

    }

    public ShoppingTour(TourType tour, Integer dayNumber, TransportType transport, FoodType food, CityType city, ShopType shopType) {

        super(tour, dayNumber, transport, food, city);
        this.shopType = shopType;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShoppingTour shoppingTour = (ShoppingTour) obj;
        if ((getTour() == shoppingTour.getTour()) && (getDayNumber() == shoppingTour.getDayNumber()) &&
                (getTransport() == shoppingTour.getTransport()) &&
                (getFood() == shoppingTour.getFood()) && (getCity() == shoppingTour.getCity()) &&
                (getShopType() == shoppingTour.getShopType())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "ShoppingTour [ShopType";
    }
}
