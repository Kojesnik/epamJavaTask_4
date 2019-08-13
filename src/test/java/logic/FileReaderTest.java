package logic;

import entity.ShoppingTour;
import entity.Tour;
import enums.*;
import exceptions.BadInputException;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileReaderTest {

    @Test
    public void readTourFile() throws BadInputException {

        Tour exp = new ShoppingTour(TourType.SHOPPING, 10, TransportType.BUS, FoodType.RO, CityType.MOSCOW, ShopType.FOOD);
        try {
            FileReader.readTourFile();
            Tour act = FileReader.tours.get(0);
            assertEquals(exp, act);
        } catch (BadInputException e) {

        }

    }

    @Test
    public void readParamsFile() {

        Tour exp = new ShoppingTour();
        exp.setTour(TourType.SHOPPING);
        FileReader.readParamsFile();
        assertEquals(exp, FileReader.params);

    }
}