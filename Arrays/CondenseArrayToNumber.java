package Arrays_lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (arr.length > 1) {
            int[] condense = new int[arr.length-1];
            for (int i = 0; i <condense.length ; i++) {
                condense[i] = arr[i]  + arr[i+1];
            }

            arr = condense;
        }
        System.out.println(arr[0]);
    }
}
//arr [] 1 2 3 4 5
// 1+2 2+3 3+4 4+5
// 3 5 7 9
// 3+5 5+7 7+9
//8 12 16
//8+12 12+16
// 20+28
//48