import java.util.Scanner;
public class Calculator {





        public static String calc(String input) {
            String[] parts = input.split(" ");
            if (parts.length != 3) {
                throw new IllegalArgumentException("Неверный формат ввода");
            }
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[2]);
            if (a < 1 ||  a > 10 || b < 1 || b > 10) {
                throw new IllegalArgumentException("Числа должны быть от 1 до 10");
            }
            switch (parts[1]) {
                case "+":
                    return String.valueOf(a + b);
                case "-":
                    return String.valueOf(a - b);
                case "*":
                    return String.valueOf(a * b);
                case "/":
                    return String.valueOf(a / b);
                default:
                    throw new IllegalArgumentException("Неверная операция");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите арифметическое выражение (например, 1 + 2):");
            String input = scanner.nextLine();
            try {
                String result = calc(input);
                System.out.println("Результат: " + result);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }

