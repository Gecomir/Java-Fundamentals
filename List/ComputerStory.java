package List_exercises;

import java.util.Scanner;

public class ComputerStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String client = scanner.nextLine();

        double priceWithoutTax = 0;
        double tax = 0;
        double sumTax = 0;
        double totalPrice = 0;

        while (!client.equals("regular") && !client.equals("special")) {
            double price = Double.parseDouble(client);
            if (price < 0) {
                System.out.println("Invalid price!");
               // client = scanner.nextLine();
            } else {
                tax += price * 0.20;
                priceWithoutTax += price;
                sumTax += tax;
                totalPrice += price * 1.20;
            }

            client = scanner.nextLine();
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");

        } else if (client.equals("special")) {
            totalPrice -= totalPrice * 0.10;
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTax);
            System.out.printf("Taxes: %.2f$%n", tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);

        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTax);
            System.out.printf("Taxes: %.2f$%n", tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);
        }
    }
}

