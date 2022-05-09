package AssociativeArrays;

import java.util.*;

public class CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] digits = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> countNumber = new TreeMap<>();
        for (Double number : digits) {
            if (countNumber.containsKey(number)) {
                int currentCount = countNumber.get(number);
                countNumber.put(number, currentCount + 1);
            } else {
                countNumber.put(number, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countNumber.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
