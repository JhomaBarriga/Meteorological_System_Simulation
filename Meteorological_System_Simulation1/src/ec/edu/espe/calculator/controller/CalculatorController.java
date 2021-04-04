package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.Calculateangle;
import ec.edu.espe.calculator.model.Haversine;
import utils.FileManager;

public class CalculatorController {
    //Convertion 
    //Euclidian
    //Haversine

    public void save(Haversine haversine) {
        String data = haversine.getLongitude1() + "," + haversine.getLatitude1() + ","
                + haversine.getLongitude2() + "," + haversine.getLatitude2();
        FileManager.save(data, "haversine");
    }

    public static String read() {
        String data;
        data = FileManager.read("haversine.csv");
        return data;
    }
    
    

    public void save(Calculateangle calculateangle) {
        String data = calculateangle.getY() + ";" + calculateangle.getY() + ";"
                + calculateangle.getPi();
        FileManager.save(data, "calculateangle");
    }

    public static String show() {
        String data;
        data = FileManager.show("calculateangle.csv");
        return data;
    }

}
