package Text_exercises;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        int power = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (power > 0 && sb.charAt(i) != '>') {
                sb.deleteCharAt(i);
                power--;
                i--;
            } else if (sb.charAt(i) == '>') {
                power += Integer.parseInt(String.valueOf(sb.charAt(i + 1)));
            }
        }
        System.out.println(sb);
    }
}
