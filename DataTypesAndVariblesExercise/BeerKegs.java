package DataTypesAndVaribles_Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = 0;
        String kegModel = "";
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double total = Math.PI * Math.pow(radius, 2) * height;
            if (total > maxVolume) {
                maxVolume = total;
                kegModel = model;
            }
        }
        System.out.println(kegModel);
    }
}
