package logic;

import entity.Tour;
import org.apache.log4j.Logger;

import java.util.ArrayList;

/**
 *
 * @author Misha Kolesnik
 * @date 12.08.2019
 *
 * Class that provides methods to find and show tours according to params
 *
 */

public class Finder {

    private static final Logger logger = Logger.getLogger(Finder.class);

    /**
     *
     * Find all tours according to params we get
     *
     * @return array of tours
     */
    public static ArrayList<Tour> findTours() {

        int count;
        ArrayList<Tour> tours = new ArrayList<Tour>();
        for (Tour tour: FileReader.tours) {
            count = 0;
            if (tour.getTour() == FileReader.params.getTour()) {
                ++count;
            }
            if (tour.getCity() == FileReader.params.getCity()) {
                ++count;
            }
            if (tour.getDayNumber() == FileReader.params.getDayNumber()) {
                ++count;
            }
            if (tour.getFood() == FileReader.params.getFood()) {
                ++count;
            }
            if (tour.getTransport() == FileReader.params.getTransport()) {
                ++count;
            }
            if (count == FileReader.paramCount) {
                tours.add(tour);
                logger.info("Tour with selected params was found");
            }
        }

        showTours(tours);
        logger.info("All correct tours shown");

        return tours;

    }

    /**
     *
     *
     * Show all tours method get
     *
     * @parama(arraylist of tours)
     */
    private static void showTours(ArrayList<Tour> tours) {

        for (Tour tour: tours) {
            System.out.println(tour.toString());
        }

    }

}
