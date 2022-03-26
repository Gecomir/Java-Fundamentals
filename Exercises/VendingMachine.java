package Exercises;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double currentMoney = 0;

        while (!input.equals("Start")) {
            double money = Double.parseDouble((input));
            if (money == 0.10 || money == 0.20 || money == 0.50 ||
                    money == 1.00 || money == 2.00) {
                currentMoney += money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        boolean isEnough = true;

        while (!input.equals("End")) {

            if (input.equals("Nuts")) {
                double price = 2.0;
                if (currentMoney >= price) {
                    currentMoney -= 2.0;
                    System.out.println("Purchased Nuts");
                } else {
                    isEnough = false;
                }
            } else if (input.equals("Water")) {
                double price = 0.70;
                if (currentMoney >= price) {
                    currentMoney -= 0.70;
                    System.out.println("Purchased Water");
                } else {
                    isEnough = false;
                }
            } else if (input.equals("Crisps")) {
                double price = 1.50;
                if (currentMoney >= price) {
                    currentMoney -= 1.50;
                    System.out.println("Purchased Crisps");
                } else {
                    isEnough = false;
                }
            } else if (input.equals("Soda")) {
                double price = 0.80;
                if (currentMoney >= price) {
                    currentMoney -= 0.80;
                    System.out.println("Purchased Soda");
                } else {
                    isEnough = false;
                }
            } else if (input.equals("Coke")) {
                double price = 1.00;
                if (currentMoney >= price) {
                    currentMoney -= 1.00;
                    System.out.println("Purchased Coke");
                } else {
                    isEnough = false;
                }
            } else {
                System.out.println("Invalid product");
            }
            if (!isEnough) {
                System.out.println("Sorry, not enough money");
                isEnough = true;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", currentMoney);
    }
}
