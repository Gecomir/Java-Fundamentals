package List_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class AngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] prices = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int indexEnter = Integer.parseInt(scanner.nextLine());
        int enterPrice = prices[indexEnter];

        String cheapOrExp = scanner.nextLine();
        boolean isCheap = true;

        if (cheapOrExp.equals("expensive")) {
            isCheap = false;
        }

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < indexEnter; i++) {
            if(isCheap) {
                if (prices[i] < enterPrice) {
                    sumLeft += prices[i];
                }
            } else {
                if (prices[i] >= enterPrice) {
                    sumLeft += prices[i];
                }
            }
        }

        for (int i = indexEnter + 1; i < prices.length; i++) {
            if(isCheap) {
                if (prices[i] < enterPrice) {
                    sumRight += prices[i];
                }
            } else {
                if (prices[i] >= enterPrice) {
                    sumRight += prices[i];
                }
            }
        }

        if ( sumLeft >= sumRight) {
            System.out.printf("Left - %d", sumLeft);
        }

        if ( sumRight > sumLeft) {
            System.out.printf("Right - %d", sumRight);
        }
    }
}
