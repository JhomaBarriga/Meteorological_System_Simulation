package meteorological_system_simulation1;

import java.util.Scanner;

public class Meteorological_System_Simulation1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        do {
            System.out.println("❶ ➙ METEOROLOGICAL SYSTEM ");
            System.out.println("❷ ➙ GEOESPATIAL CALCULATOR");
            System.out.println("❸ ➙ TEMPERATURE CONVERSION");
            System.out.println("❹ ➙ EXIT");
            System.out.printf("Enter your menu option --> ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("【ⓂⒺⓉⒺⓄⓇⓄⓁⓄⒼⒾⒸⒶⓁ ⓈⓎⓈⓉⒺⓂ】 ");
                    System.out.println("---------------------------------------- \n");
                    System.out.println("If you are planning to do a road trip in "
                            + "Simon Bolívar Avenue");
                    System.out.println("You must check some meteorological "
                            + "conditions to avoid a crash \n");

                    Scanner data = new Scanner(System.in);
                    String name;
                    Scanner keyboard = new Scanner(System.in);
                    System.out.printf("Tell us your name, please ➙ ");
                    name = keyboard.nextLine();
                    System.out.println("");
                    System.out.println("Hi " + name + " it will be a pleasure to help you! \n");
                    System.out.println("Answer the following questions ➘ \n");

                    int option1;
                    System.out.println("YOUR UBICATION \n");
                    System.out.println("❶ ➙ Carapungo until International University");
                    System.out.println("❷ ➙ International University until Puengasi");
                    System.out.println("❸ ➙ Puegasi until South Quicenter");
                    System.out.println("❹ ➙ Exit ✘ \n");
                    System.out.printf("Enter your menu option about your ubication ➙ ");
                    option1 = data.nextInt();
                    System.out.println();
                    switch (option1) {
                        case 1:
                            System.out.println("We know your ubication ☑, continue please... ➘ \n");
                            break;
                        case 2:
                            System.out.println("We know your ubication ☑, continue please... ➘ \n");
                            break;
                        case 3:
                            System.out.println("We know your ubication ☑, continue please... ➘ \n");
                            break;
                        case 4:
                            System.out.println("IT HAS BEEN A PLEASURE TO HELP YOU ( ＾◡＾) "
                                    + "COME BACK SOON...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("ERROR ✘ \n");
                            System.exit(0);
                            break;
                    }
                    int option2;
                    System.out.println("WEATHER");
                    System.out.println("❶ ➙ Sunny day ☀");
                    System.out.println("❷ ➙ Cloudy day ☁");
                    System.out.println("❸ ➙ Rainy day ☂");
                    System.out.println("❹ ➙ Exit ✘ \n");
                    System.out.printf("Enter your menu option about the weather ➙ ");
                    option2 = data.nextInt();
                    System.out.println();
                    switch (option2) {
                        case 1:
                            System.out.println("Wait a moment please... \n");
                            break;
                        case 2:
                            System.out.println("Wait a moment please... \n");
                            break;
                        case 3:
                            System.out.println("Wait a moment please... \n");
                            break;
                        case 4:
                            System.out.println("IT HAS BEEN A PLEASURE TO HELP YOU ( ＾◡＾)"
                                    + "COME BACK SOON...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("ERROR ✘ \n");
                            System.exit(0);
                            break;
                    }

                    String ubication = String.valueOf(option);
                    String wather = String.valueOf(option1);
                    System.out.println(name + " these are the forecasts we can give you : \n");

                    if (option == 1 && option1 == 3) {
                        System.out.println("IT IS NOT SAFE TO DRIVE! ☹ \n");
                    } else if (option == 2 && option1 == 3) {
                        System.out.println("IT IS NOT SAFE TO DRIVE! ☹ \n");
                    } else if (option == 3 && option1 == 3) {
                        System.out.println("IT IS NOT SAFE TO DRIVE! ☹ \n");
                    } else {
                        System.out.println("IT IS SAFE TO DRIVE! ☺ \n");
                    }

                    break;
                case 2:
                    int option3;
                    System.out.println("GEOESPATIAL CALCULATOR");
                    System.out.println("❶ ➙ COORDINATE CONVERSION ");
                    System.out.println("❷ ➙ EUCLIDIAN DISTANCE BETWEEN TWO POINTS");
                    System.out.println("❸ ➙ DISTANCE BETWEEN TWO POINTS - SPHERICAL MODEL - HAVERSINE");
                    System.out.println("❹ ➙ DISTANCE BETWEEN TWO POINTS - ELIPSOID MODEL - VINCENTY");
                    System.out.println("❺ ➙ Exit \n");
                    System.out.printf("Enter your menu option ➙ ");
                    Scanner coordinate = new Scanner(System.in);
                    option3 = coordinate.nextInt();
                    System.out.println();
                    switch (option3) {
                        case 1:
                            // XIOMARA tu parte va aquí
                            break;
                        case 2:
                            // JHOMARA tu parte va aquí
                            break;
                        case 3:
                            System.out.printf(" Enter first longitude coordinate: ");
                            double longitude1 = coordinate.nextDouble();
                            System.out.println();
                            System.out.printf(" Enter first latitude coordinate: ");
                            double latitude1 = coordinate.nextDouble();
                            System.out.println();
                            System.out.printf(" Enter second longitude coordinate: ");
                            double longitude2 = coordinate.nextDouble();
                            System.out.println();
                            System.out.printf(" Enter first latitude coordinate: ");
                            double latitude2 = coordinate.nextDouble();
                            System.out.println();
                            double result = calculateDistanceBetweenTwoPointsHaversine(longitude1, latitude1, longitude2, latitude2);
                            System.out.println("The distance between " + latitude1 + ", " + longitude1 + " y "
                                    + latitude2 + ", " + longitude2 + " is " + result + " m");

                            break;
                        case 4:
                            // EMILIA tu parte va aquí

                            break;
                        case 5:
                            System.out.println("IT HAS BEEN A PLEASURE TO HELP YOU ( ＾◡＾)"
                                    + "COME BACK SOON...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("ERROR ✘ \n");
                            System.exit(0);
                            break;
                    }

                    break;
                case 3:
                    //DIANITA aquí tu parte
                    break;
                case 4:
                    System.out.println("IT HAS BEEN A PLEASURE TO HELP YOU ( ＾◡＾)"
                            + "COME BACK SOON...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR ✘ \n");
                    System.exit(0);
                    break;

            }

        } while (option < 4);

    }

    public static int calculateDistanceBetweenTwoPointsHaversine(double longitude1,
            double latitude1, double longitude2, double latitude2) {

        double earthRadius = 6372.795477598;
        longitude1 = Math.toRadians(longitude1);
        latitude1 = Math.toRadians(latitude1);
        longitude2 = Math.toRadians(longitude2);
        latitude2 = Math.toRadians(latitude2);

        double differenceLongitud = (longitude2 - longitude1);
        double differenceLatitud = (latitude2 - latitude1);

        double sineLongitud = Math.sin(differenceLongitud / 2);
        double sineLatitud = Math.sin(differenceLatitud / 2);

        double a = (sineLatitud * sineLatitud) + Math.cos(latitude1) * Math.cos(latitude2)
                * (sineLongitud * sineLongitud);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distanceHaversine = earthRadius * c * 1000;

        return (int) distanceHaversine;
    }
    //AQUÍ FUNCIONES PLEASE
}
