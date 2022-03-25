package Text_exercises;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        char[] text1 = data[0].toCharArray();
        char[] text2 = data[1].toCharArray();

        int smallTextLength = Math.min(text1.length, text2.length);
        int bigTextLength = Math.max(text1.length, text2.length);
        int sum = 0;

        for (int i = 0; i < bigTextLength; i++) {
            if (i < smallTextLength) {
                sum += text1[i] * text2[i];
            } else if (text1.length > text2.length) {
                sum += text1[i];
            } else {
                sum += text2[i];
            }
        }
        System.out.println(sum);
    }
}
