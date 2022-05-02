package AssociativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companies = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] data = command.split(" -> ");
            String companyName = data[0];
            String id = data[1];

            if (!companies.containsKey(companyName)) {
                companies.put(companyName, new ArrayList<String>());
            }
            if (companies.containsKey(companyName) && !companies.get(companyName).contains(id)) {
                companies.get(companyName).add(id);
            }
            command = scanner.nextLine();
        }
        companies.entrySet().stream().forEach(e -> {
            System.out.printf("%s%n", e.getKey());
            e.getValue().stream().forEach(p -> System.out.printf("-- %s%n", p));
        });
    }
}
