package DataTypesAndVaribles_Exercise;

import java.util.Scanner;

public class IntegerOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int threeNumber = Integer.parseInt(scanner.nextLine());
        int fourNumber = Integer.parseInt(scanner.nextLine());

        int result = ((firstNumber + secondNumber) / threeNumber) * fourNumber;

        System.out.println(result);
    }
}
