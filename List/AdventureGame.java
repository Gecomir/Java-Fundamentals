package List_exercises;

import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());

        double waterPerson = Double.parseDouble(scanner.nextLine());
        double totalWater = daysCount * peopleCount * waterPerson;

        double foodPerson = Double.parseDouble(scanner.nextLine());
        double totalFood = daysCount * peopleCount * foodPerson;

        for (int i = 1; i <= daysCount; i++) {
            double dailyWoodEnergy = Double.parseDouble(scanner.nextLine());

            energy -= dailyWoodEnergy;

            if (energy <= 0){
                break;
            }

            if (i % 2 == 0){
                energy += energy * 0.05;
                totalWater -= totalWater * 0.3;
            }

            if (i % 3 == 0) {
                totalFood -= totalFood / peopleCount;
                energy += energy * 0.1;
            }
        }

        if (energy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
        }
    }
}
