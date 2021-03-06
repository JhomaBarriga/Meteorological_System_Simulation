package meteorological_system_simulation1;

import java.util.Scanner;

public class Meteorological_System_Simulation1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
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
        double temperatureValue;
        double temperaturesRanges = 0;
        double higherTemperature = -100;
        double lowerTemperature = 100;
        double[] temperatures1;
        int count = 0;
        int sum = 0;
        double average;
        int weeks;
        int[] temperatures;
        do {
            printPrincipalMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    printMeteorologicalSystem();
                    Scanner data = new Scanner(System.in);
                    Scanner keyboard = new Scanner(System.in);
                    System.out.printf("Tell us your name, please ➙ ");
                    name = keyboard.nextLine();
                    System.out.println("");
                    System.out.println("Hi " + name + " it will be a pleasure to help you! \n");
                    System.out.println("Answer the following questions ➘ \n");
                    printUbication();
                    option1 = data.nextInt();
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
                    option2 = data.nextInt();
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
                    Scanner coordinate = new Scanner(System.in);
                    option3 = coordinate.nextInt();
                    System.out.println();
                    switch (option3) {
                        case 1:
                            printCoordinateConversion();
                            option4 = coordinate.nextInt();
                            System.out.println();
                            switch (option4) {
                                case 1:
                                    Scanner datacoordinate = new Scanner(System.in);
                                    System.out.print("Enter your cartesian coordinate X ➙ ");
                                    x = datacoordinate.nextInt();
                                    System.out.print("Enter your cartesian coordinate Y ➙ ");
                                    y = datacoordinate.nextInt();
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
                                    Scanner dataGPS = new Scanner(System.in);
                                    System.out.printf("Enter de longitud (GPS) ➙ ");
                                    GPSx = dataGPS.nextDouble();
                                    System.out.printf("Enter de latitud (GPS) ➙ ");
                                    GPSy = dataGPS.nextDouble();
                                    lon2x(GPSx);
                                    lat2y(GPSy);
                                    System.out.println();
                                    break;
                                case 3:
                                    Scanner dataWC = new Scanner(System.in);
                                    System.out.printf("Enter X (World Coordinates)➙ ");
                                    longitude = dataWC.nextDouble();
                                    System.out.printf("Enter Y (World Coordinates)➙ ");
                                    latitude = dataWC.nextDouble();
                                    x2lng(longitude);
                                    y2lat(latitude);
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
                            x1 = coordinate.nextDouble();
                            System.out.println("Write the value the Y1 of yout coordinate ➙ ");
                            y1 = coordinate.nextDouble();
                            System.out.println("Write the value the X2 of your coordinate that you will go ➙ ");
                            x2 = coordinate.nextDouble();
                            System.out.println("Write the value the Y2 of yout coordinate ➙ ");
                            y2 = coordinate.nextDouble();
                            System.out.println();
                            double distanceeuclidean = ShowEuclideanDistance(x2, x1, y2, y1);
                            System.out.println(" The distance that you will travel is ➙ " + distanceeuclidean);
                            break;
                        case 3:
                            System.out.printf(" Enter first longitude coordinate ➙ ");
                            longitude1 = coordinate.nextDouble();
                            System.out.println();
                            System.out.printf(" Enter first latitude coordinate ➙ ");
                            latitude1 = coordinate.nextDouble();
                            System.out.println();
                            System.out.printf(" Enter second longitude coordinate ➙ ");
                            longitude2 = coordinate.nextDouble();
                            System.out.println();
                            System.out.printf(" Enter first latitude coordinate ➙ ");
                            latitude2 = coordinate.nextDouble();
                            System.out.println();
                            result = calculateDistanceBetweenTwoPointsHaversine(longitude1, latitude1, longitude2, latitude2);
                            System.out.println("The distance between " + latitude1 + ", " + longitude1 + " y "
                                    + latitude2 + ", " + longitude2 + " is " + result + " m");
                            break;
                        case 4:
                            earthRadius = 3958.75;
                            System.out.println("enter the latitud 1 ➙ ");
                            lat1 = coordinate.nextDouble();
                            System.out.println("enter the latitud 2 ➙ ");
                            lat2 = coordinate.nextDouble();
                            System.out.println("enter the long 1 ➙ ");
                            lng1 = coordinate.nextDouble();
                            System.out.println("enter the long 2 ➙ ");
                            lng2 = coordinate.nextDouble();
                            System.out.println();
                            dist = showVincentydistance(lat2, lat1, lng2, lng1, earthRadius);
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
                    Scanner averageTemperature = new Scanner(System.in);
                    System.out.println("--- QUITO ---");
                    System.out.println("HOW MANY TEMPERATURES YOU WANT TO ENTER ➙ ");
                    quantity = averageTemperature.nextInt();
                    System.out.println("");
                    temperatures1 = new double[quantity];
                    
                    for (int i = 0; i < quantity; i++) {
                        System.out.println("Enter temperature " + (i + 1) + " ➙ ");
                        temperatures1[i] = averageTemperature.nextDouble();
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
                    System.out.println("AVERAGE RAIN: ");
                    showMonths();
                    option = scanner.nextInt();
                    System.out.print("Enter 1 to 4 weeks to be averaged ➙ ");
                    weeks = scanner.nextInt();
                    temperatures = new int[weeks];
                    switch (option) {
                        case 1:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 2:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 3:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 4:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 5:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 6:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 7:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 8:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 9:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 10:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 11:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            count = readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 12:
                            for (int i = 0; i < weeks; i++) {
                                System.out.print("Week " + (i + 1) + "'s low temperature in °C ➙ ");
                                temperatures[i] = input.nextInt();
                                sum += temperatures[i];
                            }
                            average = operatorAverage(sum, weeks);
                            readWeeks(weeks, temperatures, average, count);
                            showProbabitityOfRain(average, count);
                            break;
                        case 13:
                            printFarewell();
                            break;
                        default:
                            printError();
                            break;
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

    private static void showMonths() {
        System.out.println("1 ➙ JANUARY ");
        System.out.println("2 ➙ FEBRUARY");
        System.out.println("3 ➙ MARCH");
        System.out.println("4 ➙ APRIL");
        System.out.println("5 ➙ MAY");
        System.out.println("6 ➙ JUNE");
        System.out.println("7 ➙ JULY");
        System.out.println("8 ➙ AGOST");
        System.out.println("9 ➙ SEPTEMBER");
        System.out.println("10 ➙ OCTOBER");
        System.out.println("11 ➙ NOVEMBER");
        System.out.println("12 ➙ DECEMBER");
        System.out.println("13 ➙ Exit ✘ \n");
        System.out.printf("Enter your menu option --> ");
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
        System.out.println("❺ ➙ AVERAGE RAIN");
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

    public static void lon2x(double lon) {
        double x;
        x = (lon + 180) / 360 * 256;
        System.out.printf("X: " + x);
    }

    public static void lat2y(double aLat) {
        double y;
        y = ((1 - Math.log(Math.tan(aLat * Math.PI / 180) + 1 / Math.cos(aLat
                * Math.PI / 180)) / Math.PI) / 2 * Math.pow(2, 0)) * 256;
        System.out.printf(", Y: " + y);
    }

    public static void x2lng(double x) {
        double longitud;
        longitud = x * 360 / 256 - 180;
        System.out.println("Longitud: " + longitud);
    }

    public static void y2lat(double y) {
        double z = Math.pow(Math.E, (2 * Math.PI * (1 - y / 128)));
        double latitud;
        latitud = Math.asin((z - 1) / (z + 1)) * 180 / Math.PI;
        System.out.println("Latitude: " + latitud);
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

    private static double ShowEuclideanDistance(double x2, double x1, double y2, double y1) {
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

    private static double showVincentydistance(double lat2, double lat1, double lng2, double lng1, double earthRadius) {
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

    private static void showProbabitityOfRain(double average, int count) {
        System.out.printf("Average temp = %.1f\n", average);
        if (average <= 20) {
            System.out.println("There is a 95% probability of rain that week.");
        }
        System.out.println(count + " weeks above average");
    }

    private static int readTemperature(int weeks, int[] temperatures, Scanner input, int sum) {
        for (int i = 0; i < weeks; i++) {
            System.out.print("Week " + (i + 1) + "'s low temperature in °C: ");
            temperatures[i] = input.nextInt();
            sum += temperatures[i];
        }
        return sum;
    }

    private static double operatorAverage(int sum, int weeks) {
        double average = (double) sum / weeks;
        return average;
    }

    private static int readWeeks(int weeks, int[] temperatures, double average, int count) {
        for (int i = 0; i < weeks; i++) {
            if (temperatures[i] > average) {
                count++;
            }
        }
        return count;
    }
}
