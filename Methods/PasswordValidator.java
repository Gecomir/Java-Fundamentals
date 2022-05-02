package Methods_exercises;

import com.sun.source.tree.BreakTree;

import java.util.Locale;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (passLength(password) && consistOnlyLettersAndDigits(password)
                && hasAtLeast2Digits(password)) {
            System.out.println("Password is valid");
        }
        if (!passLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!consistOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasAtLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean passLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean consistOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.toLowerCase(Locale.ROOT).charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)) {

                return false;
            }
        }
        return true;
    }

    public static boolean hasAtLeast2Digits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                count++;
            }
        }
        return count >= 2;
    }
}
