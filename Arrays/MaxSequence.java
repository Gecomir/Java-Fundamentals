package Arrays_lab.exercise;

import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int[] arrHelper = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[j].equals(arr[i])){
                    counter ++;
                } else {
                  break;
                }
            }

            arrHelper[i] = counter;
        }

        int max = arrHelper[0];
        int index = 0;

        for (int i = 0; i < arrHelper.length; i++) {
            if (arrHelper[i] > max) {
                max = arrHelper[i];
                index = i;
            }
        }

        for (int i = 0; i < max; i++) {
            System.out.print(arr[index] + " ");
        }
    }
}
