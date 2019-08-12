import entity.Tour;
import entity.enums.TourType;
import entity.enums.TransportType;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FileReader.readTourFile();
        System.out.println(FileReader.tours.size());
        FileReader.readParamsFile();
        System.out.println(FileReader.params.getTour());
        System.out.println(FileReader.tours.get(0).getTour());
        ArrayList<Tour> tours = Finder.findTours();
        System.out.println(tours.size());

    }

}
