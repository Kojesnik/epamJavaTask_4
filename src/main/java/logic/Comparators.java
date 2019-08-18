package logic;

import entity.Tour;

import java.util.Comparator;

public class Comparators {

    public static Comparator<Tour> TourTypeComp = new Comparator<Tour>() {

        public int compare(Tour o1, Tour o2) {

            return o1.getTour().compareTo(o2.getTour());

        }

    };

    public static Comparator<Tour> CityTypeComp = new Comparator<Tour>() {

        public int compare(Tour o1, Tour o2) {

            return o1.getCity().compareTo(o2.getCity());

        }

    };

    public static Comparator<Tour> FoodTypeComp = new Comparator<Tour>() {

        public int compare(Tour o1, Tour o2) {

            return o1.getFood().compareTo(o2.getFood());

        }

    };

    public static Comparator<Tour> TransportTypeComp = new Comparator<Tour>() {

        public int compare(Tour o1, Tour o2) {

            return o1.getTransport().compareTo(o2.getTransport());

        }

    };

    public static Comparator<Tour> DayNumComp = new Comparator<Tour>() {

        public int compare(Tour o1, Tour o2) {

            return o1.getDayNumber() - o2.getDayNumber();

        }

    };

}
