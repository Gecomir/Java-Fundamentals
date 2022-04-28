package List_exercises;

import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] namesArr = scanner.nextLine().split(", ");
        String input = scanner.nextLine();
        int countBlacklisted = 0;
        int countLost = 0;

        while (!input.equals("Report")) {
            if (input.contains("Blacklist")) {
                String name = input.split(" ")[1];
                boolean isBlacklisted = false;

                for (int i = 0; i < namesArr.length; i++) {
                    if (namesArr[i].equals(name)) {
                        namesArr[i] = "Blacklisted";

                        System.out.println(name + " was blacklisted.");

                        countBlacklisted++;
                        isBlacklisted = true;
                    }
                }

                if (!isBlacklisted) {
                    System.out.println(name + " was not found.");
                }
            }

            if (input.contains("Error")) {
                int index = Integer.parseInt(input.split(" ")[1]);

                if(index < namesArr.length && index >= 0) {
                    if(!namesArr[index].equals("Blacklisted") && !namesArr[index].equals("Lost")) {
                        System.out.println(namesArr[index] + " was lost due to an error.");

                        countLost++;
                        namesArr[index] = "Lost";
                    }
                }
            }

            if (input.contains("Change")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                String newName = input.split(" ")[2];

                if(index < namesArr.length && index >= 0) {
                    System.out.printf("%s changed his username to %s.%n", namesArr[index], newName);

                    namesArr[index] = newName;
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Blacklisted names: %d %n", countBlacklisted);
        System.out.printf("Lost names: %d%n", countLost);

        for (int i = 0; i < namesArr.length; i++) {
            System.out.print(namesArr[i] + " ");
        }
    }
}
