package ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] data = line.split(" ");
            Person person = new Person(data[0], data[1], Integer.parseInt(data[2]));
            personList.add(person);

            line = scanner.nextLine();
        }
        personList.stream().sorted((p1, p2) -> Integer.compare(p1.age, p2.age))
                .forEach(person -> System.out.println(person.toString()));
    }

    static class Person {
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }
}
