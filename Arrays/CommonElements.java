package Arrays_lab.exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");


        for (int i = 0; i < secondArray.length; i++) {
            String firstElements = secondArray[i];
            for (int j = 0; j < firstArray.length; j++) {
                String secondElements = firstArray[j];
                if (secondElements.equals(firstElements)) {
                    System.out.print(secondElements + " ");
                }
            }

        }
     /*   for (String second : secondArray) {
            for (String first : firstArray) {
                if (second.equals(first)) {
                    System.out.print(first + " ");
                }
            }
        } */
    }
}

