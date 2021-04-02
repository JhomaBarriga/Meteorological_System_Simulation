package ec.edu.espe.calculator.controller;
import ec.edu.espe.calculator.model.Haversine;
import utils.FileManager;

public class CalculatorController {
    //Convertion 
    //Euclidian
    //Haversine
    
    public void save (Haversine haversine) {
        String data = haversine.getLongitude1() + "," + haversine.getLatitude1() + "," 
                + haversine.getLongitude2() + "," + haversine.getLatitude2();
        FileManager.save(data, "haversine");
    }
    public static String read() {
        String data;
        data = FileManager.read("haversine.csv");
        return data;
    }
    
    //Vincenty
    
}
