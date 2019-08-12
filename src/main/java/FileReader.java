import entity.ExcursionTour;
import entity.RestTour;
import entity.ShoppingTour;
import entity.Tour;
import entity.enums.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileReader {

    public static ArrayList<Tour> tours = new ArrayList<Tour>();
    public static Tour params;
    public static int paramCount = 0;

    public static void readTourFile() {

        try {
            FileInputStream in = new FileInputStream("/Users/kojes/Desktop/tours.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line;
            String[] lineArray;
            Tour tourToAdd = null;
            boolean isAddble;
            while ((line = br.readLine()) != null) {
                isAddble = true;
                lineArray = line.split("/");
                if (Validator.isTourType(lineArray[0])) {
                    switch (TourType.valueOf(lineArray[0])) {
                        case SHOPPING:
                            tourToAdd = (ShoppingTour) TourFactory.getTour(TourType.SHOPPING);
                            tourToAdd.setTour(TourType.SHOPPING);
                            if (Validator.isShopType(lineArray[5])) {
                                ((ShoppingTour) tourToAdd).setShopType(ShopType.valueOf(lineArray[5]));
                            } else {
                                isAddble = false;
                                //error
                            }
                            break;
                        case REST:
                            tourToAdd = (RestTour) TourFactory.getTour(TourType.REST);
                            tourToAdd.setTour(TourType.REST);
                            if (Validator.isHotelType(lineArray[5])) {
                                ((RestTour) tourToAdd).setHotelType(HotelType.valueOf(lineArray[5]));
                            } else {
                                isAddble = false;
                                //error
                            }
                            break;
                        case EXCURSION:
                            tourToAdd = (ExcursionTour) TourFactory.getTour(TourType.EXCURSION);
                            tourToAdd.setTour(TourType.EXCURSION);
                            if (Validator.isExcursionType(lineArray[5])) {
                                ((ExcursionTour) tourToAdd).setExcursionType(ExcursionType.valueOf(lineArray[5]));
                            } else {
                                isAddble = false;
                                //error
                            }
                            break;
                    }
                    if (Validator.isParsable(lineArray[1])) {
                        tourToAdd.setDayNumber(Integer.parseInt(lineArray[1]));
                    } else {
                        isAddble = false;
                        //error
                    }
                    if (Validator.isTransportType(lineArray[2])) {
                        tourToAdd.setTransport(TransportType.valueOf(lineArray[2]));
                    } else {
                        isAddble = false;
                        //error
                    }
                    if (Validator.isFoodType(lineArray[3])) {
                        tourToAdd.setFood(FoodType.valueOf(lineArray[3]));
                    } else {
                        isAddble = false;
                        //error
                    }
                    if (Validator.isCityType(lineArray[4])) {
                        tourToAdd.setCity(CityType.valueOf(lineArray[4]));
                    } else {
                        isAddble = false;
                        //error
                    }
                    if (isAddble) {
                        tours.add(tourToAdd);
                    }
                } else {
                    //error
                }

            }
        } catch (Exception e) {
            //error
        }

    }

    public static void readParamsFile() {

        try {
            FileInputStream in = new FileInputStream("/Users/kojes/Desktop/params.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line = br.readLine();
            String[] lineArray = line.split("/");
            Tour tourToAdd = null;
            if (Validator.isTourType(lineArray[0])) {
                switch (TourType.valueOf(lineArray[0])) {
                    case SHOPPING:
                        ++paramCount;
                        tourToAdd = (ShoppingTour) TourFactory.getTour(TourType.SHOPPING);
                        tourToAdd.setTour(TourType.SHOPPING);
                        if (Validator.isShopType(lineArray[5])) {
                            ((ShoppingTour) tourToAdd).setShopType(ShopType.valueOf(lineArray[5]));
                        } else {
                            //error
                        }
                        break;
                    case REST:
                        ++paramCount;
                        tourToAdd = (RestTour) TourFactory.getTour(TourType.REST);
                        tourToAdd.setTour(TourType.REST);
                        if (Validator.isHotelType(lineArray[5])) {
                            ((RestTour) tourToAdd).setHotelType(HotelType.valueOf(lineArray[5]));
                        } else {
                            //error
                        }
                        break;
                    case EXCURSION:
                        ++paramCount;
                        tourToAdd = (ExcursionTour) TourFactory.getTour(TourType.EXCURSION);
                        tourToAdd.setTour(TourType.EXCURSION);
                        if (Validator.isExcursionType(lineArray[5])) {
                            ((ExcursionTour) tourToAdd).setExcursionType(ExcursionType.valueOf(lineArray[5]));
                        } else {
                            //error
                        }
                        break;
                }

            } else if (lineArray[0].equals("-")) {
                //error
            }
            if (Validator.isParsable(lineArray[1])) {
                ++paramCount;
                tourToAdd.setDayNumber(Integer.parseInt(lineArray[1]));
            } else if (lineArray[1].equals("-")) {
                //error
            }
            if (Validator.isTransportType(lineArray[2])) {
                ++paramCount;
                tourToAdd.setTransport(TransportType.valueOf(lineArray[2]));
            } else if (lineArray[2].equals("-")) {
                //error
            }
            if (Validator.isFoodType(lineArray[3])) {
                ++paramCount;
                tourToAdd.setFood(FoodType.valueOf(lineArray[3]));
            } else if (lineArray[3].equals("-")) {
                //error
            }
            if (Validator.isCityType(lineArray[4])) {
                ++paramCount;
                tourToAdd.setCity(CityType.valueOf(lineArray[4]));
            } else if (lineArray[4].equals("-")) {
                //error
            }
            params = tourToAdd;
        } catch (Exception e) {

        }

    }

}
