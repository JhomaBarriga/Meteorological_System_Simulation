package ec.edu.espe.calculator.model;

public class Haversine {

    private double longitude1;
    private double latitude1;
    private double longitude2;
    private double latitude2;

    public Haversine(double longitude1, double latitude1, double longitude2, double latitude2) {
        this.longitude1 = longitude1;
        this.latitude1 = latitude1;
        this.longitude2 = longitude2;
        this.latitude2 = latitude2;
    }

    /**
     * @return the longitude1
     */
    public double getLongitude1() {
        return longitude1;
    }

    /**
     * @param longitude1 the longitude1 to set
     */
    public void setLongitude1(double longitude1) {
        this.longitude1 = longitude1;
    }

    /**
     * @return the latitude1
     */
    public double getLatitude1() {
        return latitude1;
    }

    /**
     * @param latitude1 the latitude1 to set
     */
    public void setLatitude1(double latitude1) {
        this.latitude1 = latitude1;
    }

    /**
     * @return the longitude2
     */
    public double getLongitude2() {
        return longitude2;
    }

    /**
     * @param longitude2 the longitude2 to set
     */
    public void setLongitude2(double longitude2) {
        this.longitude2 = longitude2;
    }

    /**
     * @return the latitude2
     */
    public double getLatitude2() {
        return latitude2;
    }

    /**
     * @param latitude2 the latitude2 to set
     */
    public void setLatitude2(double latitude2) {
        this.latitude2 = latitude2;
    }

}
