import entity.ExcursionTour;
import entity.enums.*;

import java.text.ParseException;

public class Validator {

    public static boolean isDay(String input) {

        int inputt = Integer.parseInt(input);
        if (inputt <= 0 || inputt > 30) {
            return false;
        }

        return true;

    }

    public static boolean isParsable(String input) {

        try {
            Integer.parseInt(input);
            return true;
        }catch (Exception e) {
            return false;
        }

    }

    public static boolean isTourType(String input) {

        try {
            TourType.valueOf(input);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean isShopType(String input) {

        try {
            ShopType.valueOf(input);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean isHotelType(String input) {

        try {
            HotelType.valueOf(input);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean isExcursionType(String input) {

        try {
            ExcursionType.valueOf(input);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean isTransportType(String input) {

        try {
            TransportType.valueOf(input);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean isFoodType(String input) {

        try {
            FoodType.valueOf(input);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean isCityType(String input) {

        try {
            CityType.valueOf(input);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
