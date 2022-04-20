package Examp_preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> destinations = new ArrayList<>();
        Pattern pattern = Pattern.compile("([=/])(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        boolean foundSomething = matcher.find();
        while (foundSomething) {
            String destination = matcher.group("destination");
            destinations.add(destination);
            foundSomething = matcher.find();
        }
        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: " + destinations.stream().mapToInt(d -> d.length()).sum());
    }
}
