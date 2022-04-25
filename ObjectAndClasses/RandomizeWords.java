package ObjectAndClasses;

import java.util.*;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = (scanner.nextLine().split(" "));
        Random random = new Random();
        for (int i = 0; i < words.length; i++) {

            int firstWord = random.nextInt(words.length);
            int secondWord = random.nextInt(words.length);
            String changer = words[firstWord];
            words[firstWord]=words[secondWord];
            words[secondWord] =changer;
        }
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println(word);
        }
        //for (String word: words) {
         //   System.out.println(word);
      //  }
      // System.out.println(String.join(" ", words));

    }
}
