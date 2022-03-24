package Methods_exercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        sumNumbers(number1, number2, number3);
    }

    public static void sumNumbers(int number1, int number2, int number3) {
        int sum = (number1 + number2) - number3;
        System.out.println(sum);

    }
}
