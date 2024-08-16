import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getInt("Введіть перше число:");
        int num2 = getInt("Введіть друге число:");
        char operation = getOperation("Введіть операцію (+, -, *, або /):");
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Помилка вводу числа. Спробуйте ще раз.");
            scanner.next(); // Рекурсія
            return getInt(prompt);
        }
    }

    public static char getOperation(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            return scanner.next().charAt(0);
        } else {
            System.out.println("Помилка вводу операції. Спробуйте ще раз.");
            scanner.next(); // Рекурсія
            return getOperation(prompt);
        }
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Нерозпізнана операція. Повторіть ввод.");
                result = calc(num1, num2, getOperation("Введіть операцію (+, -, *, або /):")); // Рекурсія
        }
        return result;
    }
}
