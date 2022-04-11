package Rexeg_lab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phone = scanner.nextLine();
        String regex = ("\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b");

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        List<String> phoneNumber = new LinkedList<>();

        while (matcher.find()) {
            phoneNumber.add(matcher.group());

        }
        System.out.println(String.join(", ", phoneNumber));
    }
}