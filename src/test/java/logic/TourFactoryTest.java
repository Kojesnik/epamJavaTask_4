package logic;

import entity.ExcursionTour;
import entity.RestTour;
import entity.ShoppingTour;
import entity.Tour;
import enums.TourType;
import org.junit.Test;

import static org.junit.Assert.*;

public class TourFactoryTest {

    @Test
    public void getTour() {

        Tour exp1 = new ShoppingTour();
        Tour act1 = TourFactory.getTour(TourType.SHOPPING);
        Tour exp2 = new RestTour();
        Tour act2 = TourFactory.getTour(TourType.REST);
        Tour exp3 = new ExcursionTour();
        Tour act3 = TourFactory.getTour(TourType.EXCURSION);
        assertEquals(exp1, act1);
        assertEquals(exp2, act2);
        assertEquals(exp3, act3);

    }
}