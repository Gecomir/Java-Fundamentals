package Methods_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SmallesOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int smalesOfNumbers = getSmallNumbers(number1, number2, number3);
        System.out.println(smalesOfNumbers);
    }

    public static int getSmallNumbers(int number1, int number2, int number3) {
        int[] numbers = {number1, number2, number3};
        Arrays.sort(numbers);
        return numbers[0];
    }
}
