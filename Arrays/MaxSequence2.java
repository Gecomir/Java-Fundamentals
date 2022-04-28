package Arrays_lab.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequence2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxCounter = 0;
        int number = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    counter++;
                } else {
                   break;
                }
            }

            if(counter > maxCounter) {
                maxCounter = counter;
                number = arr[i];
            }
        }

        for (int i = 0; i < maxCounter; i++) {
            System.out.print(number + " ");
        }
    }
}
