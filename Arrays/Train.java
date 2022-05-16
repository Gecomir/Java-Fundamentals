package Arrays_lab.exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < wagons; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sum += numbers;
            System.out.print(numbers + " ");
        }
        System.out.printf("%n%d", sum);
    }
}
