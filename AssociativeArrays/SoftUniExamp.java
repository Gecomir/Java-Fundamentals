package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> peopleRes = new LinkedHashMap<>();
        Map<String, Integer> submits = new LinkedHashMap<>();
        String input = "";
        while (!"exam finished".equals(input = scanner.nextLine())) {
            String[] line = input.split("-");

            if (line.length == 3) {
                String name = line[0];
                String language = line[1];
                int points = Integer.parseInt(line[2]);
                if (!peopleRes.containsKey(name)) {
                    peopleRes.put(name, points);
                } else if (peopleRes.get(name) < points) {
                    peopleRes.put(name, points);
                }

                if (!submits.containsKey(language)) {
                    submits.put(language, 1);
                } else {
                    submits.put(language, submits.get(language) + 1);
                }
            } else {
                peopleRes.remove(line[0]);
            }

        }

        System.out.println("Results:");
        peopleRes.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(String.format("%s | %d",
                            entry.getKey(), entry.getValue()));
                });

        System.out.println("Submissions:");
        submits.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(String.format("%s - %d",
                            entry.getKey(), entry.getValue()));
                });

    }
}

