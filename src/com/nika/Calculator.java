package com.nika;

/**
 * Created by nika.shkuratova on 01.03.2017.
 */
public class Calculator {

    private double firstParameter;
    private double secondParameter;
    private String operation;

    public Calculator(double firstParameter, double secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

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

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
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
