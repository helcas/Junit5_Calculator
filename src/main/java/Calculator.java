import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your first number:");
        double num1 = scanner.nextInt();
        System.out.print("Choose between + - * /");
        char choice = scanner.next(".").charAt(0);
        System.out.println("Input your second number:");
        double num2 = scanner.nextInt();
        Calculate calc = new Calculate();

        switch (choice) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + calc.multiply(num1, num2));
                break;
            case '/':
                System.out.println(num1 + " * " + num2 + " = " + calc.divide(num1, num2));
                break;
            default:
        }
    }
}

