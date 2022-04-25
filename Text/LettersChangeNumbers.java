package Text_exercises;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (String s : input) {
            char letterBefore = s.charAt(0);
            char letterAfter = s.charAt(s.length() - 1);
            String digit = s.substring(1, s.length() - 1);
            double number = Double.parseDouble(digit);

            int letterBeforePosition = getAlphabetPosition(letterBefore);
            int letterAfterPosition = getAlphabetPosition(letterAfter);

            if (Character.isUpperCase(letterBefore)) {
                //If it's uppercase you divide the number by the letter's position in the alphabet.
                sum += number / letterBeforePosition;
            } else {
                //  If it's lowercase you multiply the number with the letter's position in the alphabet.
                sum += number * letterBeforePosition;
            }
            if (Character.isUpperCase(letterAfter)) {
                //If it's uppercase you subtract its position from the resulted number.
                sum -= letterAfterPosition;
            } else {
                //If it's lowercase you add its position to the resulted number.
                sum += letterAfterPosition;
            }
        }
        System.out.printf("%.2f", sum);
    }

    static int getAlphabetPosition(char c) {
        return Character.toLowerCase(c) - 96;
    }
}
