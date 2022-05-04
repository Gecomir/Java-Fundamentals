package Exercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String symbol = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            symbol += "" + name.charAt(i);
        }
        System.out.println(symbol);
    }
}
