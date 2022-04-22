package Rexeg_exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s*");

        String regexDamage = "[+-]?\\d+\\.?\\d*";
        String regexHealth = "[^0-9*//\\+\\-.]";

        double damage = 0;
        double health = 0;

        Map<String, List<Double>> demonsInfo = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {  //each demon
            String demon = input[i].replaceAll(" ", "");

            Pattern pattern = Pattern.compile(regexHealth);
            Matcher matcher = pattern.matcher(demon);

            int countMultiply = 0;
            int countDivide = 0;


            for (int j = 0; j < demon.length(); j++) {


                if ((char) demon.charAt(j) == '*') {
                    countMultiply++;
                } else if ((char) demon.charAt(j) == '/') {
                    countDivide++;
                }
            }
            while (matcher.find()) {   // Making Health sum

                health += matcher.group().charAt(0);

            }
            Pattern pattern1 = Pattern.compile(regexDamage);
            Matcher matcher1 = pattern1.matcher(demon);

            while (matcher1.find()) {
                damage += Double.parseDouble(matcher1.group());
            }
            for (int k = 0; k < countDivide; k++) {
                damage /= 2;
            }
            for (int l = 0; l < countMultiply; l++) {
                damage *= 2;
            }

            List<Double> healthDamage = new ArrayList<>();
            healthDamage.add(health);
            healthDamage.add(damage);
            demonsInfo.put(demon, healthDamage);

            damage = 0;
            health = 0;
        }
        for (Map.Entry<String, List<Double>> entry : demonsInfo.entrySet()) {
            System.out.printf("%s - %.0f health, %.2f damage%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }
    }
}