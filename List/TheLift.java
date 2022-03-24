package List_exercises;
import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tourists = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        String[] line = input.split(" ");
        int[] lift = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < lift.length; i++) {
            if (lift[i] < 4) {
                if (tourists >= 4 - lift[i]) {
                    tourists -= 4 - lift[i];
                    lift[i] = 4;
                } else {
                    lift[i] += tourists;
                    tourists = 0;
                }
            }
        }
        boolean isNotFull = false;

        for (int j : lift) {
            if (j < 4) {
                isNotFull = true;
                break;
            }
        }
        if (tourists == 0 && isNotFull) {
            System.out.println("The lift has empty spots!");
        } else if (tourists > 0 && !isNotFull) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", tourists);
        }
        for (int j : lift) {
            System.out.print(" " + j);
        }
    }
}



