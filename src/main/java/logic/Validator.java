package logic;

import enums.*;
import org.apache.log4j.Logger;

/**
 *
 * @author Misha Kolesnik
 * @date 12.08.2019
 *
 * Class that provides methods to check info we get
 *
 */

public class Validator {

    private static final Logger logger = Logger.getLogger(Validator.class);

    public static boolean isParsable(String input) {

        try {
            Integer.parseInt(input);
            if (Integer.parseInt(input) <= 0) {
                logger.info("DayNum not correct");
                return false;
            }
            logger.info("DayNum is correct");
            return true;
        }catch (Exception e) {
            logger.info("DayNum not correct");
            return false;
        }

    }

    public static boolean isTourType(String input) {

        try {
            TourType.valueOf(input);
            logger.info("TourType is correct");
            return true;
        } catch (Exception e) {
            logger.info("TourType not correct");
            return false;
        }

    }

    public static boolean isShopType(String input) {

        try {
            ShopType.valueOf(input);
            logger.info("ShopType is correct");
            return true;
        } catch (Exception e) {
            logger.info("ShopType not correct");
            return false;
        }

    }

    public static boolean isHotelType(String input) {

        try {
            HotelType.valueOf(input);
            logger.info("HotelType is correct");
            return true;
        } catch (Exception e) {
            logger.info("HotelType not correct");
            return false;
        }

    }

    public static boolean isExcursionType(String input) {

        try {
            ExcursionType.valueOf(input);
            logger.info("ExcursionType is correct");
            return true;
        } catch (Exception e) {
            logger.info("ExcursionType not correct");
            return false;
        }

    }

    public static boolean isTransportType(String input) {

        try {
            TransportType.valueOf(input);
            logger.info("TransportType is correct");
            return true;
        } catch (Exception e) {
            logger.info("TransportType not correct");
            return false;
        }

    }

    public static boolean isFoodType(String input) {

        try {
            FoodType.valueOf(input);
            logger.info("FoodType is correct");
            return true;
        } catch (Exception e) {
            logger.info("FoodType not correct");
            return false;
        }

    }

    public static boolean isCityType(String input) {

        try {
            CityType.valueOf(input);
            logger.info("CityType is correct");
            return true;
        } catch (Exception e) {
            logger.info("CityType not correct");
            return false;
        }

    }

}
