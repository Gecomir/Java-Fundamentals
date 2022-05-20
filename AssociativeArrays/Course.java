package AssociativeArrays;

import java.util.*;

public class Course {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] data = command.split(" : ");
            String course = data[0];
            String student = data[1];

            if (!courses.containsKey(course)) {
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(student);

            command = scanner.nextLine();
        }
        courses.entrySet().stream()//.sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.printf("%s: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().stream().forEach(p -> System.out.printf("-- %s%n", p));
                    // .sorted(String::compareTo)
                });
    }
}
