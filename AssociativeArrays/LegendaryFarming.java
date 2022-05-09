package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isWinner = false;
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);
        String winner = "";
        while (!isWinner) {
            String[] data = scanner.nextLine().split("\\s+");
            for (int i = 0; i < data.length - 1; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String result = data[i + 1].toLowerCase();

                items.putIfAbsent(result, 0);
                items.put(result, items.get(result) + quantity);

                if (result.equals("shards") ||
                        result.equals("fragments") || result.equals("motes")) {

                    if (items.get(result) >= 250) {
                        items.put(result, items.get(result) - 250);
                        winner = result;
                        isWinner = true;
                        break;
                    }
                }
            }
        }
        switch (winner) {
            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }
        items.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}

