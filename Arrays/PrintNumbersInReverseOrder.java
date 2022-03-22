package Arrays_lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[numberCount];

        for (int i = 0; i < numberCount; i++) {
          int number = Integer.parseInt(scanner.nextLine());
          numbers [i] = number;
        }
        for (int i = numberCount - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
