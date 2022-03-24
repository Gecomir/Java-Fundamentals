package Methods_exercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        diviseNumbers(number1, number2);
    }
    private static void diviseNumbers(int number1, int number2) {
        long sumOfNumber1 = 1;
        long sumOfNumber2 = 1;
        for (int i = number1; i > 0; i--) {
            sumOfNumber1 *= i;
        }
        for (int j = number2; j > 0; j--) {
            sumOfNumber2 *= j;
        }

        double allPrintSum = sumOfNumber1 * 1.0 / sumOfNumber2;
        System.out.printf("%.2f", allPrintSum);
    }
}
