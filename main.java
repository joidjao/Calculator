package org.example.javacalculator;

public class Main {

    public static void main(String[] args) {


        Calculator calc = new Calculator(10, 5);

       
        System.out.println("Number 1: " + calc.getNumber1());
        System.out.println("Number 2: " + calc.getNumber2());

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());

  
        calc.setNumber1(20);
        calc.setNumber2(4);

        System.out.println("\nUpdated Numbers:");
        System.out.println("Number 1: " + calc.getNumber1());
        System.out.println("Number 2: " + calc.getNumber2());

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
    }
}