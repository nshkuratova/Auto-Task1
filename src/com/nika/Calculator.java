package com.nika;

/**
 * Created by nika.shkuratova on 01.03.2017.
 */
public class Calculator {

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

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    private double firstParameter;
    private double secondParameter;
    private char operation;


    public Calculator(double firstParameter, double secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    public Calculator () {
    }

    public double add (double firstParameter, double secondParameter) {
        return firstParameter + secondParameter;
    }
}
