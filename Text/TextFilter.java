package Text_exercises;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String banned : bannedWords) {
            String censored = repeat("*", banned.length());
            text = text.replace(banned, censored);
        }
        System.out.println(text);
    }

    private static String repeat(String s, int length) {
        StringBuilder replacement = new StringBuilder();
        for (int i = 0; i < length; i++) {
            replacement.append(s);
        }
        return replacement.toString();
    }
}

