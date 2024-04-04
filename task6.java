import java.util.InputMismatchException;
import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.println("Введите первое число:");
        num1 = getValidNumber(scanner);

        System.out.println("Введите второе число:");
        num2 = getValidNumber(scanner);

        Calculator calculator = new Calculator();

        System.out.println("Выберите операцию: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result;
        try {
            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    throw new IllegalArgumentException("Неправильная операция!");
            }

            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }

    private static double getValidNumber(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите корректное число.");
                scanner.next(); 
            }
        }
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return num1 / num2;
    }
}
