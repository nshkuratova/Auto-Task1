package com.nika;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        double firstPar;
        double secondPar;

        System.out.print("Insert first parameter: ");
        firstPar = scanner.nextDouble();

        System.out.print("Select operation (+, -, /, *): ");
        calc.setOperation(scanner.next());

        System.out.print("Insert second parameter: ");
        secondPar = scanner.nextDouble();

        System.out.println("Result:" + calc.add(firstPar, secondPar));

    }
}
