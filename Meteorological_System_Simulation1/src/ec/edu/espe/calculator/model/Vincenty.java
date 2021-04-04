/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.model;

/**
 *
 * @author Emilia
 */
public class Vincenty {
    private double lat1;
    private double lat2;
    private double lng1;
    private double lng2;
    private double earthRadius;

    public Vincenty(double lat1, double lat2, double lng1, double lng2, double earthRadius) {
        this.lat1 = lat1;
        this.lat2 = lat2;
        this.lng1 = lng1;
        this.lng2 = lng2;
        this.earthRadius = earthRadius;
    }

    /**
     * @return the lat1
     */
    public double getLat1() {
        return lat1;
    }

    /**
     * @param lat1 the lat1 to set
     */
    public void setLat1(double lat1) {
        this.lat1 = lat1;
    }

    /**
     * @return the lat2
     */
    public double getLat2() {
        return lat2;
    }

    /**
     * @param lat2 the lat2 to set
     */
    public void setLat2(double lat2) {
        this.lat2 = lat2;
    }

    /**
     * @return the lng1
     */
    public double getLng1() {
        return lng1;
    }

    /**
     * @param lng1 the lng1 to set
     */
    public void setLng1(double lng1) {
        this.lng1 = lng1;
    }

    /**
     * @return the lng2
     */
    public double getLng2() {
        return lng2;
    }

    /**
     * @param lng2 the lng2 to set
     */
    public void setLng2(double lng2) {
        this.lng2 = lng2;
    }

    /**
     * @return the earthRadius
     */
    public double getEarthRadius() {
        return earthRadius;
    }

    /**
     * @param earthRadius the earthRadius to set
     */
    public void setEarthRadius(double earthRadius) {
        this.earthRadius = earthRadius;
    }
    
}
