import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scientific Calculator Menu:");
        System.out.println("1. Square root function (√x)");
        System.out.println("2. Factorial function (x!)");
        System.out.println("3. Natural logarithm (base e) - ln(x)");
        System.out.println("4. Power function (x^b)");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                squareRootFunction();
                break;
            case 2:
                factorialFunction();
                break;
            case 3:
                naturalLogarithmFunction();
                break;
            case 4:
                powerFunction();
                break;
            default:
                System.out.println("Invalid choice! Please choose between 1 and 4.");
        }

        scanner.close();
    }

    private static void squareRootFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();
        double result = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + result);
    }

    private static void factorialFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        long result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    private static void naturalLogarithmFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its natural logarithm: ");
        double number = scanner.nextDouble();
        double result = Math.log(number);
        System.out.println("Natural logarithm of " + number + " is: " + result);
    }

    private static void powerFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent (b): ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}

