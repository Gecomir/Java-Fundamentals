package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, Integer> result = new LinkedHashMap<>();
        while (!line.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!result.containsKey(line)) {
                result.put(line, quantity);
            } else {
                result.put(line, result.get(line) + quantity);
            }

            line = scanner.nextLine();
        }
        result.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}
