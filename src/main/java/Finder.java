import entity.Tour;

import java.io.File;
import java.util.ArrayList;

public class Finder {

    public static ArrayList<Tour> findTours() {

        int count;
        ArrayList<Tour> tours = new ArrayList<Tour>();
        for (Tour tour: FileReader.tours) {
            count = 0;
            if (tour.getTour() == FileReader.params.getTour()) {
                System.out.println("here");
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
            }
        }

        return tours;

    }

}
