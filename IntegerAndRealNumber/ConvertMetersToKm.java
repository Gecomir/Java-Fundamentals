package IntegerAndRealNumber;

import java.util.Scanner;

public class ConvertMetersToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double metersToKm = meters / 1000.0;
        System.out.printf("%.2f", metersToKm);
    }
}
