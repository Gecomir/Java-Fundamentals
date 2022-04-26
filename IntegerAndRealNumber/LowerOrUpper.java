package IntegerAndRealNumber;

import java.util.Locale;
import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();

        if (first.equals(first.toUpperCase(Locale.ROOT))) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
