package DataTypesAndVaribles_More_Exercise;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isIt = false;
        for (int i = 2; i <= number; i++) {
            if (i % 2 == 0) {
                isIt = true;
                System.out.printf("%d -> %b%n", i, true);
            } else {
                System.out.printf("%d -> %b%n", i, false);
            }
        }
    }
}
