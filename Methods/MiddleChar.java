package Methods_exercises;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleChar(text);

    }

    public static void printMiddleChar(String text) {
        if (text.length() % 2 == 0) {
            System.out.print(text.charAt(text.length() / 2 - 1));
            System.out.print(text.charAt(text.length() / 2));

        } else {
            System.out.println(text.charAt(text.length() / 2));
        }
    }
}
