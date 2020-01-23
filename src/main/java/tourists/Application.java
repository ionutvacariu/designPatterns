package tourists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static ArrayList<Destination> destinations;
    static StringBuffer stringBufferOfData = new StringBuffer();


    public static void main(String[] args) throws FileNotFoundException {
        //login
        File file = new File(args[0]);
        Scanner sc = new Scanner(file);
        destinations = new ArrayList<>();
        Destination d = new Destination();


        populateDestinations(sc, d);
        printDestinations();

    }

    private static void printDestinations() {
        for (Destination destination : destinations) {
            System.out.println(destination.getCountry());
            for (City c : destination.getCities()) {
                System.out.println("\t" + c.getName());
                for (Hotel h : c.getHotels()) {
                    System.out.println("\t\t" + h.getName());
                    System.out.println("\t\t\t" + h.getAvailableRooms());
                    System.out.println("\t\t\t" + h.getPrice());
                    System.out.println("\t\t\t" + h.getRating());
                    if (h instanceof GuestHouse) {
                        System.out.println("\t\t\t" + ((GuestHouse) h).getSpecialFood());
                    }
                }
            }
        }
    }

    private static void populateDestinations(Scanner sc, Destination d) {
        while (sc.hasNext()) {

            String country;//= sc.next();

            if (d.getCountry() == null) {
                country = sc.next();
            } else {
                country = d.getCountry();
                d = new Destination();
            }
            if (country.startsWith("C")) {
                destinations.add(d);
                d.setCountry(country);
                d.setCities(new ArrayList<>());
                City city = new City();
                while (sc.hasNext()) {
                    String cityName;
                    if (city.getName() == null) {
                        cityName = sc.next();

                    } else {
                        cityName = city.getName();
                        city = new City();
                    }

                    if (cityName.startsWith("CY")) {
                        city.setHotels(new ArrayList<>());
                        city.setName(cityName);
                        d.getCities().add(city);
                        while (sc.hasNext()) {
                            String hotel = sc.next();

                            if (hotel.startsWith("H")) {
                                Hotel h = new Hotel();
                                h.setName(hotel);
                                h.setRating(Integer.valueOf(sc.next().split("-")[1]));
                                h.setAvailableRooms(Integer.valueOf(sc.next().split("-")[1]));
                                h.setPrice(Double.valueOf(sc.next().split("-")[1]));
                                city.getHotels().add(h);
                            } else if (hotel.startsWith("P")) {
                                GuestHouse gh = new GuestHouse();

                                gh.setName(hotel);
                                gh.setRating(Integer.valueOf(sc.next().split("-")[1]));
                                gh.setAvailableRooms(Integer.valueOf(sc.next().split("-")[1]));
                                gh.setPrice(Double.valueOf(sc.next().split("-")[1]));
                                gh.setSpecialFood(sc.next().split("-")[1]);

                                city.getHotels().add(gh);

                            } else if (hotel.startsWith("CY")) {
                                city.setName(hotel);
                                break;
                            } else if (hotel.startsWith("C")) {
                                d.setCountry(hotel);
                                break;
                            } else {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
