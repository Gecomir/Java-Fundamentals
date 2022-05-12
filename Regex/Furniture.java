package Rexeg_exercises;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String regex = "[>]{2}(?<name>[\\w]+)[<]{2}(?<price>[\\d.]+)!(?<quantity>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> purchases = new LinkedList<>();
        double totalSpendMoney = 0;
        while (!line.equals("Purchase")) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                purchases.add(name);
                totalSpendMoney += price * quantity;
            }

            line = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String s : purchases) {
            System.out.println(s);
        }
        System.out.printf("Total money spend: %.2f", totalSpendMoney);
    }
}
