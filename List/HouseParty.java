package List_exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> peopleList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] data = line.split("\\s+");
            String name = data[0];

            if (!line.contains("is not going!")) {
                if (peopleList.contains(name))  { // (data.length == 3)
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    peopleList.add(name);
                }
            } else {
                if (peopleList.contains(name)) {
                    peopleList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        peopleList.forEach(System.out::println);
    }
}
