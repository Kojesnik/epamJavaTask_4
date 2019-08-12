package logic;

import entity.ExcursionTour;
import entity.RestTour;
import entity.ShoppingTour;
import entity.Tour;
import enums.*;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Misha Kolesnik
 * @date 12.08.2019
 *
 * Class that provides methods to read all info about tours and params from files
 *
 */

public class FileReader {

    private static final Logger logger = Logger.getLogger(FileReader.class);


    public static ArrayList<Tour> tours = new ArrayList<Tour>();
    public static Tour params;
    public static int paramCount = 0;


    /**
     *
     *
     * Read and checl info about tours from file
     * Create obj and put them into arraylist
     *
     */
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
                            logger.info("ShoppingTour object created");
                            if (Validator.isShopType(lineArray[5])) {
                                ((ShoppingTour) tourToAdd).setShopType(ShopType.valueOf(lineArray[5]));
                                logger.info("ShopType added");
                            } else {
                                logger.warn("Bad ShopType info");
                                isAddble = false;
                            }
                            break;
                        case REST:
                            tourToAdd = (RestTour) TourFactory.getTour(TourType.REST);
                            tourToAdd.setTour(TourType.REST);
                            logger.info("RestTour object created");
                            if (Validator.isHotelType(lineArray[5])) {
                                ((RestTour) tourToAdd).setHotelType(HotelType.valueOf(lineArray[5]));
                                logger.info("HotelType added");
                            } else {
                                isAddble = false;
                                logger.warn("Bad HotelType info");
                            }
                            break;
                        case EXCURSION:
                            tourToAdd = (ExcursionTour) TourFactory.getTour(TourType.EXCURSION);
                            tourToAdd.setTour(TourType.EXCURSION);
                            logger.info("ShoppingTour object created");
                            if (Validator.isExcursionType(lineArray[5])) {
                                ((ExcursionTour) tourToAdd).setExcursionType(ExcursionType.valueOf(lineArray[5]));
                                logger.info("ExcursionType added");
                            } else {
                                isAddble = false;
                                logger.warn("Bad ExcursionType info");
                            }
                            break;
                    }
                    if (Validator.isParsable(lineArray[1])) {
                        tourToAdd.setDayNumber(Integer.parseInt(lineArray[1]));
                        logger.info("DayNumber added");
                    } else {
                        isAddble = false;
                        logger.warn("Bad DayNumber info");
                    }
                    if (Validator.isTransportType(lineArray[2])) {
                        tourToAdd.setTransport(TransportType.valueOf(lineArray[2]));
                        logger.info("TransportType added");
                    } else {
                        isAddble = false;
                        logger.warn("Bad TransportType info");
                    }
                    if (Validator.isFoodType(lineArray[3])) {
                        tourToAdd.setFood(FoodType.valueOf(lineArray[3]));
                        logger.info("FoodType added");
                    } else {
                        isAddble = false;
                        logger.warn("Bad FoodType info");
                    }
                    if (Validator.isCityType(lineArray[4])) {
                        tourToAdd.setCity(CityType.valueOf(lineArray[4]));
                        logger.info("CityType added");
                    } else {
                        isAddble = false;
                        logger.warn("Bad CityType info");
                    }
                    if (isAddble) {
                        tours.add(tourToAdd);
                        logger.info("Tour created and added successfully");
                    }
                } else {
                    logger.warn("Bad TourType info");
                }

            }
        } catch (Exception e) {
            logger.error("Cant read tour file");
        }

    }

    /**
     *
     *
     * Read and check params
     * Create obj with all info
     *
     */
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
                        logger.info("ShoppingTour object created");
                        if (Validator.isShopType(lineArray[5])) {
                            ((ShoppingTour) tourToAdd).setShopType(ShopType.valueOf(lineArray[5]));
                            logger.info("ShopType added to params");

                        } else {
                            logger.warn("Bad ShopType info");
                        }
                        break;
                    case REST:
                        ++paramCount;
                        tourToAdd = (RestTour) TourFactory.getTour(TourType.REST);
                        tourToAdd.setTour(TourType.REST);
                        logger.info("RestTour object created");
                        if (Validator.isHotelType(lineArray[5])) {
                            ((RestTour) tourToAdd).setHotelType(HotelType.valueOf(lineArray[5]));
                            logger.info("HotelType added to params");
                        } else {
                            logger.warn("Bad HotelType info");
                        }
                        break;
                    case EXCURSION:
                        ++paramCount;
                        tourToAdd = (ExcursionTour) TourFactory.getTour(TourType.EXCURSION);
                        tourToAdd.setTour(TourType.EXCURSION);
                        logger.info("ExcursionTour object created");
                        if (Validator.isExcursionType(lineArray[5])) {
                            ((ExcursionTour) tourToAdd).setExcursionType(ExcursionType.valueOf(lineArray[5]));
                            logger.info("ExcursionType added to params");
                        } else {
                            logger.warn("Bad ExcursionType info");
                        }
                        break;
                }

            } else if (lineArray[0].equals("-")) {
                logger.warn("TourType not in param list");
            }
            if (Validator.isParsable(lineArray[1])) {
                ++paramCount;
                tourToAdd.setDayNumber(Integer.parseInt(lineArray[1]));
                logger.info("DayNumber added to params");
            } else if (lineArray[1].equals("-")) {
                logger.warn("DayNumber not in param list");
            }
            if (Validator.isTransportType(lineArray[2])) {
                ++paramCount;
                tourToAdd.setTransport(TransportType.valueOf(lineArray[2]));
                logger.info("TransportType added to params");
            } else if (lineArray[2].equals("-")) {
                logger.warn("TransportType not in param list");
            }
            if (Validator.isFoodType(lineArray[3])) {
                ++paramCount;
                tourToAdd.setFood(FoodType.valueOf(lineArray[3]));
                logger.info("FoodType added to params");
            } else if (lineArray[3].equals("-")) {
                logger.warn("FoodType not in param list");
            }
            if (Validator.isCityType(lineArray[4])) {
                ++paramCount;
                tourToAdd.setCity(CityType.valueOf(lineArray[4]));
                logger.info("CityType added to params");
            } else if (lineArray[4].equals("-")) {
                logger.warn("CityType not in param list");
            }
            params = tourToAdd;
            logger.info("Params added");
        } catch (Exception e) {
            logger.error("Cant read param file");
        }

    }

}
