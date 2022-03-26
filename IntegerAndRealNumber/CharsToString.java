package IntegerAndRealNumber;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = firstName + secondName + delimiter;
        System.out.println(result);
    }
}
