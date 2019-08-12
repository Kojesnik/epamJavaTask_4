package logic;

import entity.ShoppingTour;
import entity.Tour;
import enums.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FinderTest {

    @Test
    public void findTours() {

        FileReader.readTourFile();
        FileReader.readParamsFile();
        ArrayList<Tour> exp = new ArrayList<Tour>();
        exp.add(new ShoppingTour(TourType.SHOPPING, 10, TransportType.BUS, FoodType.RO, CityType.MOSCOW, ShopType.FOOD));
        assertEquals(exp.get(0) , Finder.findTours().get(0));

    }
}