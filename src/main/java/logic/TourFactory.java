package logic;

import entity.ExcursionTour;
import entity.RestTour;
import entity.ShoppingTour;
import entity.Tour;
import enums.FoodType;
import enums.TourType;
import enums.TransportType;
import org.apache.log4j.Logger;

/**
 *
 * @author Misha Kolesnik
 * @date 12.08.2019
 *
 * Class that provides methods to create needed obj
 *
 */

public class TourFactory {

    private static final Logger logger = Logger.getLogger(TourFactory.class);

    /**
     *
     *
     * Create needed obj and return it
     *
     * @param(TourType)
     * @return obj of needed tour
     */
    public static Tour getTour(TourType tourType) {

        Tour toReturn = null;
        switch (tourType) {
            case SHOPPING:
                toReturn = new ShoppingTour();
                logger.info("ShoppingTour obj created");
                break;
            case REST:
                toReturn = new RestTour();
                logger.info("RestTour obj created");
                break;
            case EXCURSION:
                toReturn = new ExcursionTour();
                logger.info("ExcursionTour obj created");
                break;
            default: break;
        }

        return toReturn;

    }

}
