package AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> synonyms = new LinkedHashMap<>();
        for (int i = 0; i <n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            synonyms.putIfAbsent(word, new ArrayList<>());
            synonyms.get(word).add(synonym);
        }
        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().
                    toString().replace("[", "").replace("]", ""));
        }
    }
}
//Използваш директно toString() метода на ArrayList, а той слага елементите между "[" и "]".
//Има много варианти да заобиколиш този проблем, напр.:
//entry.getValue().toString().replace("[", "").replace("]", "")
//или
//entry.getValue().toString().substring(1, entry.getValue().toString().length() - 1)
//или
//entry.getValue().stream().collect(Collectors.joining(", "))