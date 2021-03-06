package meteorological_system_simulation1;

import java.util.Scanner;

public class Meteorological_System_Simulation1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        int option1;
        String name;
        int option2;
        int option3;
        int option4;
        float x;
        float y;
        float module;
        float angle;
        float pi = 3.14F;
        double GPSx;
        double GPSy;
        double longX;
        double latY;
        double xLong;
        double yLati;
        double longitude;
        double latitude;
        double x1;
        double y1;
        double x2;
        double y2;
        double longitude1;
        double longitude2;
        double latitude1;
        double latitude2;
        double result;
        double earthRadius = 3958.75;
        double lat1;
        double lat2;
        double lng1;
        double lng2;
        double dist;
        double Fahrenheit;
        double Celsius;
        int quantity;
        int negativeTemperatures = 0;
        double temperaturesRanges = 0;
        double higherTemperature = -100;
        double lowerTemperature = 100;
        double[] temperatures1;
        

        do {
            printPrincipalMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    printMeteorologicalSystem();
                    System.out.printf("Tell us your name, please ➙ ");
                    name = scanner.nextLine();
                    System.out.println("");
                    System.out.println("Hi " + name + " it will be a pleasure to help you! \n");
                    System.out.println("Answer the following questions ➘ \n");
                    printUbication();
                    option1 = scanner.nextInt();
                    System.out.println();
                    switch (option1) {
                        case 1:
                            printMessage();
                            break;
                        case 2:
                            printMessage();
                            break;
                        case 3:
                            printMessage();
                            break;
                        case 4:
                            printFarewell();
                            break;
                        default:
                            printError();
                            break;
                    }
                    printWeather();
                    option2 = scanner.nextInt();
                    System.out.println();
                    switch (option2) {
                        case 1:
                            printWait();
                            break;
                        case 2:
                            printWait();
                            break;
                        case 3:
                            printWait();
                            break;
                        case 4:
                            printFarewell();
                            break;
                        default:
                            printError();
                            break;
                    }
                    printForecasts(option, option1, name);
                    break;
                case 2:
                    printGeoespatialCalculator();
                    option3 = scanner.nextInt();
                    System.out.println();
                    switch (option3) {
                        case 1:
                            printCoordinateConversion();
                            option4 = scanner.nextInt();
                            System.out.println();
                            switch (option4) {
                                case 1:
                                    System.out.print("Enter your cartesian coordinate X ➙ ");
                                    x = scanner.nextInt();
                                    System.out.print("Enter your cartesian coordinate Y ➙ ");
                                    y = scanner.nextInt();
                                    System.out.println("Your coordiante is ➙ " + "(" + x + "i , " + y + "j" + ")");
                                    System.out.println();
                                    System.out.println("In this moment we are converting your coordinate to polar coordinate... ");
                                    System.out.println();
                                    module = calculateModule(x, y);
                                    System.out.println(" The module of your polar coordinate is ➙ " + module);
                                    angle = calculateangle(y, x, pi);
                                    System.out.println(" The angle of your polar coordinate is ➙ " + angle);
                                    System.out.println();
                                    System.out.println("Your polar coordinate ➙ " + "(" + module + " , " + angle + ")");
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.printf("Enter de longitud (GPS) ➙ ");
                                    GPSx = scanner.nextDouble();
                                    System.out.printf("Enter de latitud (GPS) ➙ ");
                                    GPSy = scanner.nextDouble();
                                    longX = calculateX(GPSx);
                                    System.out.printf("X: " + longX);
                                    latY = calculateY(GPSy);
                                    System.out.printf(", Y: " + latY);
                                    System.out.println();
                                    break;
                                case 3:
                                    System.out.printf("Enter X (World Coordinates)➙ ");
                                    longitude = scanner.nextDouble();
                                    System.out.printf("Enter Y (World Coordinates)➙ ");
                                    latitude = scanner.nextDouble();
                                    xLong = calculateLongitude(longitude);
                                    System.out.println("Longitud: " + xLong);
                                    yLati = calculateLatitude(latitude);
                                    System.out.println("Latitude: " + yLati);
                                    System.out.println();
                                    break;
                                case 4:
                                    printFarewell();
                                    break;
                                default:
                                    printError();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Write the value the X1 of your coordinate in this moment ➙ ");
                            x1 = scanner.nextDouble();
                            System.out.println("Write the value the Y1 of yout coordinate ➙ ");
                            y1 = scanner.nextDouble();
                            System.out.println("Write the value the X2 of your coordinate that you will go ➙ ");
                            x2 = scanner.nextDouble();
                            System.out.println("Write the value the Y2 of yout coordinate ➙ ");
                            y2 = scanner.nextDouble();
                            System.out.println();
                            double distanceeuclidean = calculateEuclideanDistance(x2, x1, y2, y1);
                            System.out.println(" The distance that you will travel is ➙ " + distanceeuclidean);
                            break;
                        case 3:
                            System.out.printf(" Enter first longitude coordinate ➙ ");
                            longitude1 = scanner.nextDouble();
                            System.out.println();
                            System.out.printf(" Enter first latitude coordinate ➙ ");
                            latitude1 = scanner.nextDouble();
                            System.out.println();
                            System.out.printf(" Enter second longitude coordinate ➙ ");
                            longitude2 = scanner.nextDouble();
                            System.out.println();
                            System.out.printf(" Enter first latitude coordinate ➙ ");
                            latitude2 = scanner.nextDouble();
                            System.out.println();
                            result = calculateDistanceBetweenTwoPointsHaversine(longitude1, latitude1, longitude2, latitude2);
                            System.out.println("The distance between " + latitude1 + ", " + longitude1 + " y "
                                    + latitude2 + ", " + longitude2 + " is " + result + " m");
                            break;
                        case 4:
                            earthRadius = 3958.75;
                            System.out.println("enter the latitud 1 ➙ ");
                            lat1 = scanner.nextDouble();
                            System.out.println("enter the latitud 2 ➙ ");
                            lat2 = scanner.nextDouble();
                            System.out.println("enter the long 1 ➙ ");
                            lng1 = scanner.nextDouble();
                            System.out.println("enter the long 2 ➙ ");
                            lng2 = scanner.nextDouble();
                            System.out.println();
                            dist = calculateVincentydistance(lat2, lat1, lng2, lng1, earthRadius);
                            System.out.println("The distance that you will travel is ➙ " + dist);
                            break;
                        case 5:
                            printFarewell();
                            break;
                        default:
                            printError();
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Enter degrees Fahrenheit ➙ ");
                    Fahrenheit = scanner.nextInt();
                    Celsius = showConvertionTemperature(Fahrenheit);
                    System.out.printf("The degrees in Celsius are ➙ " + Celsius);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("--- QUITO ---");
                    System.out.println("HOW MANY TEMPERATURES YOU WANT TO ENTER ➙ ");
                    quantity = scanner.nextInt();
                    System.out.println("");
                    temperatures1 = new double[quantity];

                    for (int i = 0; i < quantity; i++) {
                        System.out.println("Enter temperature " + (i + 1) + " ➙ ");
                        temperatures1[i] = scanner.nextDouble();
                    }

                    for (int i = 0; i < quantity; i++) {
                        temperaturesRanges = calculateTemperaturesRanges(temperaturesRanges, temperatures1, i);
                        higherTemperature = calculateHigherTemperature(temperatures1, i, higherTemperature);
                        lowerTemperature = calculateLowerTemperature(temperatures1, i, lowerTemperature);
                        negativeTemperatures = calculateNegativeTemperatures(temperatures1, i, negativeTemperatures);
                    }
                    printTemperaturesRanges(temperaturesRanges, quantity, higherTemperature, lowerTemperature, negativeTemperatures);
                    break;
                case 5:
                    String[] seasons = {"Winter ", "Summer", "Spring", "Autumn"};
                    for (String season : seasons) {
                        System.out.println("The seasons are  ➙ " + season);
                    }
                    break;
                case 6:
                    System.out.println("IT HAS BEEN A PLEASURE TO HELP YOU (＾◡＾)"
                            + "COME BACK SOON...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR \n");
                    break;
            }

        } while (option < 7);
    }

    private static void printTemperaturesRanges(double temperaturesRanges, int quantity, double higherTemperature, double lowerTemperature, int negativeTemperatures) {
        System.out.println("--------");
        System.out.println("The Temperature Average is ➙ " + (temperaturesRanges / quantity));
        System.out.println("The Higher Temperature is ➙ " + higherTemperature);
        System.out.println("The Lower Tempereature is ➙ " + lowerTemperature);
        System.out.println("The Numbers of Temperatures Under 0 are ➙ " + negativeTemperatures);
        System.out.println("--------");
        System.out.println("IT HAS BEEN A PLEASURE TO HELP YOU (＾◡＾)"
                + "COME BACK SOON...");
    }

    private static void printWait() {
        System.out.println("Wait a moment please... \n");
    }

    private static void printMessage() {
        System.out.println("We know your ubication ☑, continue please... ➘ \n");
    }

    private static void printError() {
        System.out.println("ERROR ✘ \n");
    }

    private static void printFarewell() {
        System.out.println("IT HAS BEEN A PLEASURE TO HELP YOU ( ＾◡＾)"
                + "COME BACK SOON...");
        System.exit(0);
    }

    private static double showConvertionTemperature(double Fahrenheit) {
        double Celsius;
        Celsius = (Fahrenheit - 32) * 5 / 9;
        return Celsius;
    }

    private static void printCoordinateConversion() {
        System.out.println("COORDINATE CONVERSION ");
        System.out.println("❶ ➙ RECTANGULAR TO POLAR COORDINATES");
        System.out.println("❷ ➙ GPS (LATITUDE/LONGITUDE)TO WORLD COORDINATES");
        System.out.println("❸ ➙ WORLD COORDINATES TO GPS (LATITUDE/LONGITUDE)");
        System.out.println("❹ ➙ Exit \n");
        System.out.printf("Enter your menu option ➙ ");
    }

    private static void printGeoespatialCalculator() {
        System.out.println("GEOESPATIAL CALCULATOR");
        System.out.println("❶ ➙ COORDINATE CONVERSION ");
        System.out.println("❷ ➙ EUCLIDIAN DISTANCE BETWEEN TWO POINTS");
        System.out.println("❸ ➙ DISTANCE BETWEEN TWO POINTS - SPHERICAL MODEL - HAVERSINE");
        System.out.println("❹ ➙ DISTANCE BETWEEN TWO POINTS - ELIPSOID MODEL - VINCENTY");
        System.out.println("❺ ➙ Exit \n");
        System.out.printf("Enter your menu option ➙ ");
    }

    private static void printForecasts(int option, int option1, String name) {
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
    }

    private static void printWeather() {
        System.out.println("WEATHER");
        System.out.println("❶ ➙ Sunny day ☀");
        System.out.println("❷ ➙ Cloudy day ☁");
        System.out.println("❸ ➙ Rainy day ☂");
        System.out.println("❹ ➙ Exit ✘ \n");
        System.out.printf("Enter your menu option about the weather ➙ ");
    }

    private static void printUbication() {
        System.out.println("YOUR UBICATION \n");
        System.out.println("❶ ➙ Carapungo until International University");
        System.out.println("❷ ➙ International University until Puengasi");
        System.out.println("❸ ➙ Puegasi until South Quicenter");
        System.out.println("❹ ➙ Exit ✘ \n");
        System.out.printf("Enter your menu option about your ubication ➙ ");
    }

    private static void printMeteorologicalSystem() {
        System.out.println("----------------------------------------");
        System.out.println("【ⓂⒺⓉⒺⓄⓇⓄⓁⓄⒼⒾⒸⒶⓁ ⓈⓎⓈⓉⒺⓂ】 ");
        System.out.println("---------------------------------------- \n");
        System.out.println("If you are planning to do a road trip in "
                + "Simon Bolívar Avenue");
        System.out.println("You must check some meteorological "
                + "conditions to avoid a crash \n");
    }

    private static void printPrincipalMenu() {
        System.out.println("❶ ➙ METEOROLOGICAL SYSTEM ");
        System.out.println("❷ ➙ GEOESPATIAL CALCULATOR");
        System.out.println("❸ ➙ TEMPERATURE CONVERSION");
        System.out.println("❹ ➙ AVERAGE TEMPERATURE");
        System.out.println("❺ ➙ SEASONS");
        System.out.println("❻ ➙ EXIT");
        System.out.printf("Enter your menu option ➙ ");
    }

    public static double calculateTemperaturesRanges(double temperaturesRanges, double[] temperatures1, int i) {
        temperaturesRanges = temperaturesRanges + temperatures1[i];
        return temperaturesRanges;
    }

    public static int calculateNegativeTemperatures(double[] temperatures1, int i, int negativeTemperatures) {
        if (temperatures1[i] < 0) {
            negativeTemperatures = negativeTemperatures + 1;
        }
        return negativeTemperatures;
    }

    public static double calculateLowerTemperature(double[] temperatures1, int i, double lowerTemperature) {
        if (temperatures1[i] < lowerTemperature) {
            lowerTemperature = temperatures1[i];
        }
        return lowerTemperature;
    }

    public static double calculateHigherTemperature(double[] temperatures1, int i, double higherTemperature) {
        if (temperatures1[i] > higherTemperature) {
            higherTemperature = temperatures1[i];
        }
        return higherTemperature;
    }

    public static double calculateX(double lon) {
        double x;
        x = (lon + 180) / 360 * 256;
        return x;
    }

    public static double calculateY(double aLat) {
        double y;
        y = ((1 - Math.log(Math.tan(aLat * Math.PI / 180) + 1 / Math.cos(aLat
                * Math.PI / 180)) / Math.PI) / 2 * Math.pow(2, 0)) * 256;
        return y;
    }

    public static double calculateLongitude(double x) {
        double longitude;
        longitude = x * 360 / 256 - 180;
        return longitude;
    }

    public static double calculateLatitude(double y) {
        double z = Math.pow(Math.E, (2 * Math.PI * (1 - y / 128)));
        double latitude;
        latitude = Math.asin((z - 1) / (z + 1)) * 180 / Math.PI;
        return latitude;
    }

    private static float calculateangle(float y, float x, float pi) {
        float angle;
        angle = (float) Math.atan(y / x) * (180 / pi);
        return angle;
    }

    private static float calculateModule(float x, float y) {
        float module;
        float X;
        X = (float) Math.pow(x, 2);
        float Y;
        Y = (float) Math.pow(y, 2);
        module = (float) Math.sqrt(X + Y);
        return module;
    }

    private static double calculateEuclideanDistance(double x2, double x1, double y2, double y1) {
        double part1;
        double part2;
        double distanceEuclidean;
        //Euclidean formula
        //part of the formula

        part1 = (x2 - x1) * (x2 - x1);
        part2 = (y2 - y1) * (y2 - y1);
        distanceEuclidean = Math.sqrt(part1 + part2);

        return distanceEuclidean;
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

    private static double calculateVincentydistance(double lat2, double lat1, double lng2, double lng1, double earthRadius) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLng = Math.toRadians(lng2 - lng1);
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);
        double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
                * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double dist = earthRadius * c;
        return dist;
    }

}
