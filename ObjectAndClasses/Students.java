package ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            studentsList.add(student);
        }
        studentsList.stream().sorted((s1, s2) -> Double.compare(s2.grade, s1.grade))
                .forEach(student -> System.out.println(student.toString()));
    }

    static class Student {
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }
    }
}
