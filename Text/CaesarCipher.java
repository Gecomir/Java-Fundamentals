package Text_exercises;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char symbol : input) {
            sb.append(String.format("%c", symbol + 3));
        }
        System.out.println(sb);
    }
}
