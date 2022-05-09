package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingSoftUni_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCommand = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingUsers = new LinkedHashMap<>();
        for (int i = 0; i < numberCommand; i++) {
            String command = scanner.nextLine();
            String[] tokens = command.split(" ");
            String operation = tokens[0];
            String name = tokens[1];

            if (operation.equals("register")) {
                String plateNumber = tokens[2];
                if (!parkingUsers.containsKey(name)) {
                    parkingUsers.put(name, plateNumber);
                    System.out.printf("%s registered %s successfully%n", name, plateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }
            } else if (operation.equals("unregister")) {
                if (!parkingUsers.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    parkingUsers.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
        }
        parkingUsers.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
