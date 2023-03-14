import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the first number
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        // Get the operation to perform
        System.out.print("Enter operation (+, -, *, /, %, ^, sqr, sqrt): ");
        String operation = input.next();

        // Get the second number
        System.out.print("Enter a second number: ");
        double num2 = input.nextDouble();

        double result;
        switch (operation) {
            case "+":
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    break;
                }
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case "%":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    break;
                }
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
            case "^":
                // Get the second number for power
                System.out.print("Enter power: ");
                int power = input.nextInt();
                result = Math.pow(num1, power);
                System.out.println(num1 + " ^ " + power + " = " + result);
                break;
            case "sqr":
                // Square the first number
                result = num1 * num1;
                System.out.println(num1 + " squared = " + result);
                break;
            case "sqrt":
                // Take the square root of the first number
                if (num1 < 0) {
                    System.out.println("Cannot take square root of a negative number.");
                    break;
                }
                result = Math.sqrt(num1);
                System.out.println("Square root of " + num1 + " = " + result);
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
        input.close();
    }
}
