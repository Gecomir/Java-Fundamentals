package ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsFromTown {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String[] studentsParameters = input.split(" ");
            String firstName = studentsParameters[0];
            String lastName = studentsParameters[1];
            int age = Integer.parseInt(studentsParameters[2]);
            String town = studentsParameters[3];

            int index = indexOfStudents(students, firstName, lastName);
            if (index == -1) {
                students.add(new Students(firstName, lastName, age, town));
            } else {
                students.set(index, new Students(firstName, lastName, age, town));
            }

            input = scanner.nextLine();
        }

        String town = scanner.nextLine();
        for (Students student : students) {
            if (student.isFrom(town)) {
                System.out.println(student.getInfo());
            }
        }
    }

    private static int indexOfStudents(List<Students> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            Students s = students.get(i);
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                return i;
            }
        }
        return -1;
    }

    static class Students {
        String firstName;
        String lastName;
        int age;
        String town;

        public Students(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {

            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        boolean isFrom(String town) {
            return this.town.equals(town);
        }

        String getInfo() {
            return String.format("%s %s is %d years old", this.firstName, this.lastName, this.age);
        }
    }
}
