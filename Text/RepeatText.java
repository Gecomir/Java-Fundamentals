package Text_exercises;

import java.util.Scanner;

public class RepeatText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            int count = word.length();
            for (int i = 0; i < count; i++) {
                sb.append(word);
            }
        }
        System.out.println(sb);
    }
}
