package Examp_preparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Move":
                    message = move(message, Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    message = insert(message, Integer.parseInt(commandParts[1]), commandParts[2]);
                    break;
                case "ChangeAll":
                    message = change(message, commandParts[1], commandParts[2]);
                    break;
                default:
                    throw new IllegalStateException("Unknown command" + commandName);
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }

    private static String change(String message, String commandPart, String substr) {
        return message.replaceAll(commandPart, substr);
    }

    private static String insert(String message, int index, String commandPart) {
        String firstPart = message.substring(0, index);
        String secondPart = message.substring(index);
        return firstPart + commandPart + secondPart;
    }

    private static String move(String message, int index) {
        String firstPart = message.substring(0, index);
        String secondPart = message.substring(index);
        return secondPart + firstPart;
    }
}
