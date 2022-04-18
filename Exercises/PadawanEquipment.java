package Exercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double pricePerSabers = Double.parseDouble(scanner.nextLine());
        double pricePerRobes = Double.parseDouble(scanner.nextLine());
        double pricePerBells = Double.parseDouble(scanner.nextLine());

        double sabers = Math.ceil(countStudents * 1.10);
        int bells = countStudents - countStudents / 6;

        double totalPrice = bells * pricePerBells + sabers * pricePerSabers + pricePerRobes * countStudents;
        if (money >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - money);
        }
    }
}
