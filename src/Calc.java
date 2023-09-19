package src;

import java.util.Scanner;

class Calc {
    static void calcSwitch(double numA, double numB, char operation) {
        double result = 0;

        switch (operation) {
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                result = numA / numB;
                break;
            default:
                System.out.println("Oops! Incorrect operation");
        }
        if (result != 0) System.out.println("Result of: " + numA + " " + operation + " " + numB + " = " + result);
    }

    static void calcIfElse(double numA, double numB, char operation) {
        double result = 0;
        if (operation == '+') {
            result = numA + numB;
        } else if (operation == '-') {
            result = numA - numB;
        } else if (operation == '*') {
            result = numA * numB;
        } else if (operation == '/') {
            result = numA / numB;
        } else {
            System.out.println("Oops! Incorrect operation");
        }
        if (result != 0) System.out.println("Result of: " + numA + " " + operation + " " + numB + " = " + result);
    }

    public static void main(String[] args) {
        double numA, numB;
        char operation;
        int construction;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number A:");
        numA = input.nextDouble();

        System.out.println("Enter operation of: +, -, *, /");
        operation = input.next().charAt(0);

        System.out.println("Enter number B:");
        numB = input.nextDouble();

        System.out.println("Enter calc construction: \n1 - switch\n2 - ifelse");
        construction = input.nextInt();

        if (construction == 1) {
            calcSwitch(numA, numB, operation);
        } else if (construction == 2) {
            calcIfElse(numA, numB, operation);
        } else {
            System.out.println("Wrong construction");
        }
    }
}