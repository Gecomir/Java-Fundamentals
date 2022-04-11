package Rexeg_lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        String regex = ("(?<day>[\\d]{2})([/.-])(?<month>[A-Z]{1}[a-z]{2})\\2(?<year>[\\d]{4})\\b");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);

        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
