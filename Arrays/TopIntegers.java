package Arrays_lab.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String inputString = "";

        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    break;
                } else {
                    counter += 1;
                }
            }
            if (counter == array.length - i - 1) {
                inputString += array[i] + " ";
            }
        }
        System.out.print(inputString);
    }
}