public class Calculator {
  
    private double number1;
    private double number2;

    public Calculator() {
        this(0, 0);
    }

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double add() {
        return performOperation(number1 + number2);
    }

    public double subtract() {
        return performOperation(number1 - number2);
    }

    public double multiply() {
        return performOperation(number1 * number2);
    }

    public double divide() {
        if (number2 == 0) {
            handleDivisionByZero();
            return 0;
        }
        return performOperation(number1 / number2);
    }

    private double performOperation(double result) {
        return result;
    }

    private void handleDivisionByZero() {
        System.out.println("Error: Division by zero is not allowed.");
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5);

        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());
    }
}
