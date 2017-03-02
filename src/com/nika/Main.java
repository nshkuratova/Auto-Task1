package com.nika;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        double result = 0;
        String operation = "";

        while (true) {
            try {
                System.out.print("Insert first parameter: ");
                calc.setFirstParameter(scanner.nextDouble());

                System.out.print("Select operation (+, -, /, *): ");
                operation = scanner.next();

                System.out.print("Insert second parameter: ");
                calc.setSecondParameter((scanner.nextDouble()));

                switch (operation) {
                    case "+":
                        result = calc.add(calc.getFirstParameter(), calc.getSecondParameter());
                        break;
                    case "-":
                        result = calc.subtract(calc.getFirstParameter(), calc.getSecondParameter());
                        break;
                    case "*":
                        result = calc.multiply(calc.getFirstParameter(), calc.getSecondParameter());
                        break;
                    case "/":
                        result = calc.divide(calc.getFirstParameter(), calc.getSecondParameter());
                        break;
                    default:
                        throw new InputMismatchException("Wrong input");
                }

                System.out.println("Result:" + result);

                System.out.println("Exit? y/n");
                if ("y".equalsIgnoreCase(scanner.next())) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: wrong type of parameter");
                scanner.nextLine();
            }
        }

    }
}
