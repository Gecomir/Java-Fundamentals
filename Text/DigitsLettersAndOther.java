package Text_exercises;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder allLetters = new StringBuilder();
        StringBuilder allDigit = new StringBuilder();
        StringBuilder allOther = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            if (Character.isDigit(text.charAt(i))) {
                allDigit.append(text.charAt(i));
            } else if (Character.isLetter(text.charAt(i))) {
                allLetters.append(text.charAt(i));
            } else {
                allOther.append(text.charAt(i));
            }
        }

        System.out.printf("%s%n%s%n%s%n", allDigit, allLetters, allOther);
    }
}
