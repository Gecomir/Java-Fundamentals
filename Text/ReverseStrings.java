package Text_exercises;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder word = new StringBuilder();
        while (!input.equals("end")) {
            word = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                word.append(input.charAt(i));

                if (word.length() == input.length()) {
                    System.out.printf("%s = %s%n", input, word);
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }
}
