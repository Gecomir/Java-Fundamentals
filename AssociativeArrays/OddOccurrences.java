package AssociativeArrays;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> counts = new LinkedHashMap<>();

        List<String> odd = new ArrayList<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase(Locale.ROOT);

            if (counts.containsKey(wordInLowerCase)) {
                counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
            } else {
                counts.put(wordInLowerCase, 1);
            }
        }
        for (Map.Entry<String,Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odd.add(entry.getKey());
            }
        }
        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i));
            if (i < odd.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
