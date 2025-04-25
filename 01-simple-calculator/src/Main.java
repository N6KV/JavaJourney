// 01 ~ Simple Calculator -- <-N6KV->
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2;
        System.out.println("Please note that this calculator only supports numbers between -2147483647 and +2147483647.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        number2 = scanner.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        int result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}