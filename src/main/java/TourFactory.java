import entity.ExcursionTour;
import entity.RestTour;
import entity.ShoppingTour;
import entity.Tour;
import entity.enums.FoodType;
import entity.enums.TourType;
import entity.enums.TransportType;

public class TourFactory {

    public static Tour getTour(TourType tourType) {

        Tour toReturn = null;
        switch (tourType) {
            case SHOPPING:
                toReturn = new ShoppingTour();
                break;
            case REST:
                toReturn = new RestTour();
                break;
            case EXCURSION:
                toReturn = new ExcursionTour();
                break;
            default: break;
        }

        return toReturn;

    }

}
