package com.nika;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Insert first parameter: ");
        calc.setFirstParameter(scanner.nextDouble());

        System.out.print("Select operation (): ");

        System.out.print("Insert second parameter: ");
        calc.setSecondParameter(scanner.nextDouble());

    }
}
