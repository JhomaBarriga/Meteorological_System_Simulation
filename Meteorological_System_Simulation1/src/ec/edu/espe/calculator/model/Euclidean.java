/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.model;

/**
 *
 * @author asus
 */
public class Euclidean {

    private double X1;
    private double Y1;
    private double X2;
    private double Y2;

    public Euclidean(double X1, double Y1, double X2, double Y2) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
    }

    /**
     * @return the X1
     */
    public double getX1() {
        return X1;
    }

    /**
     * @param X1 the X1 to set
     */
    public void setX1(double X1) {
        this.X1 = X1;
    }

    /**
     * @return the Y1
     */
    public double getY1() {
        return Y1;
    }

    /**
     * @param Y1 the Y1 to set
     */
    public void setY1(double Y1) {
        this.Y1 = Y1;
    }

    /**
     * @return the X2
     */
    public double getX2() {
        return X2;
    }

    /**
     * @param X2 the X2 to set
     */
    public void setX2(double X2) {
        this.X2 = X2;
    }

    /**
     * @return the Y2
     */
    public double getY2() {
        return Y2;
    }

    /**
     * @param Y2 the Y2 to set
     */
    public void setY2(double Y2) {
        this.Y2 = Y2;
    }
    
}
