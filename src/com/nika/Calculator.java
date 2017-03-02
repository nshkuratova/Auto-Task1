package com.nika;

/**
 * Created by nika.shkuratova on 01.03.2017.
 */
public class Calculator {

    private double firstParameter;
    private double secondParameter;

    public Calculator() {
    }

    public double getFirstParameter() {
        return firstParameter;
    }

    public void setFirstParameter(double firstParameter) {
        this.firstParameter = firstParameter;
    }

    public double getSecondParameter() {
        return secondParameter;
    }

    public void setSecondParameter(double secondParameter) {
        this.secondParameter = secondParameter;
    }

    public double add(double firstParameter, double secondParameter) {
        return firstParameter + secondParameter;
    }

    public double subtract(double firstParameter, double secondParameter) {
        return firstParameter - secondParameter;
    }

    public double divide(double firstParameter, double secondParameter) {
        return firstParameter / secondParameter;
    }

    public double multiply(double firstParameter, double secondParameter) {
        return firstParameter * secondParameter;
    }
}
