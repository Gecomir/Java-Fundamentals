package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parking = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] data = line.split(" ");
            String operation = data[0];
            String name = data[1];

            if (operation.equals("register")) {
                String plateNumber = data[2];
                if (!parking.containsValue(plateNumber)) {
                    parking.put(name, plateNumber);
                    System.out.printf("%s registered %s successfully%n", name, plateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }
            } else if (operation.equals("unregister")) {
                if (!parking.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    parking.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
        }
        parking.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
