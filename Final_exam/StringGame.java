import java.util.Locale;
import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] commandArr = scanner.nextLine().split(" ");

        while (!commandArr[0].equals("Done")){
            switch (commandArr[0]) {
                case "Change":
                    text = text.replaceAll(commandArr[1], commandArr[2]);
                    System.out.println(text);
                    break;
                case "Includes":
                    if (text.contains(commandArr[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String end = text.substring(text.length() - commandArr[1].length(), text.length());
                    if (end.equals(commandArr[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    text = text.toUpperCase(Locale.ROOT);
                    System.out.println(text);
                    break;
                case "FindIndex":
                    int index = text.indexOf(commandArr[1],0);
                    System.out.printf("%d%n", index);
                    break;
                case "Cut":
                    text = text.substring(Integer.parseInt(commandArr[1]), Integer.parseInt(commandArr[1]) +  Integer.parseInt(commandArr[2]));
                    System.out.println(text);
                    break;
            }

            commandArr = scanner.nextLine().split(" ");
        }

    }
}
