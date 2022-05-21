package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishNameOfTheLastDigit_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int lastDigit = digit % 10;


        Map<Integer, String> englishNames = new LinkedHashMap<>();
        englishNames.put(0, "zero");
        englishNames.put(1, "one");
        englishNames.put(2, "two");
        englishNames.put(3, "three");
        englishNames.put(4, "four");
        englishNames.put(5, "five");
        englishNames.put(6, "six");
        englishNames.put(7, "seven");
        englishNames.put(8, "eight");
        englishNames.put(9, "nine");

        if (lastDigit < 0) {
            lastDigit = Math.abs(lastDigit);
        }
        System.out.println(englishNames.get(lastDigit));
    }
}
