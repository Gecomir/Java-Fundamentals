package Arrays_lab;

import java.util.Scanner;

public class CommonEllements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if(firstArr[i].equals(secondArr[j])) {
                    System.out.print(firstArr[i] + " ");
                }
            }
        }

//        for (String itemOne : firstArr) {
//            for (String itemTwo : secondArr) {
//                if (itemOne.equals(itemTwo)) {
//                    System.out.print(itemOne + " ");
//                }
//            }
//        }
    }
}
