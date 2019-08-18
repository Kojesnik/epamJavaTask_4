package logic;

import java.util.Arrays;
import java.util.Collections;


/**
 *
 * @author Misha Kolesnik
 * @date 18.08.2019
 *
 * Class that provides methods to sort TOUR ARRAY by different params
 *
 */
public class Sort {

    public static void sortByTour() {

        Collections.sort(FileReader.tours, Comparators.TourTypeComp);

    }

    public static void sortByCity() {

        Collections.sort(FileReader.tours, Comparators.CityTypeComp);

    }

    public static void sortByFood() {

        Collections.sort(FileReader.tours, Comparators.FoodTypeComp);

    }

    public static void sortByTransport() {

        Collections.sort(FileReader.tours, Comparators.TransportTypeComp);

    }

    public static void sortByDayNum() {

        Collections.sort(FileReader.tours, Comparators.DayNumComp);

    }


}
