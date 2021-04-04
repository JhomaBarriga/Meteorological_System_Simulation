package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static boolean createFile(String fileName) {
        boolean created = false;
        try {
            File file = new File(fileName + ".csv");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;

        createFile(fileName);

        try {
            FileWriter myWrite = new FileWriter(fileName + ".csv", true);
            myWrite.write(data + System.getProperty("line.separator"));
            myWrite.close();
            System.out.println("a new record of " + fileName + " was saved");
            saved = true;
        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }

        return saved;
    }

    public static String read(String fileName) {
        String text = " ";
        try {
            Scanner s = new Scanner(new File(fileName));
            while (s.hasNextLine()) {
                text = text + s.nextLine() + "\n";

            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        return text;
    }

    //Convertion 
    public static double calculateangle(double y, double x, double pi) {
        double angle;
        angle = (double) Math.atan(y / x) * (180 / pi);
        return angle;
    }

    //Haversine
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

    //EUCLIDEAN
    public static double CalculateEuclideanDistance(double x2, double x1, double y2, double y1) {
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

    public static double calculateVincentydistance(double lat2, double lat1, double lng2, double lng1, double earthRadius) {
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
