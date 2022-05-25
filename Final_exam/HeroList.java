import java.util.*;

public class HeroList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> heroesMap = new LinkedHashMap<>();

        String[] commandArr = scanner.nextLine().split(" ");

        while (!commandArr[0].equals("End")) {
            switch (commandArr[0]) {
                case "Enroll":
                    if (heroesMap.containsKey(commandArr[1])) {
                        System.out.printf("%s is already enrolled.%n", commandArr[1]);
                    } else {
                        heroesMap.put(commandArr[1], new ArrayList<>());
                    }
                    break;
                case "Learn":
                    if (!heroesMap.containsKey(commandArr[1])) {
                        System.out.printf("%s doesn't exist.%n", commandArr[1]);
                    } else {
                        List<String> spellbook = heroesMap.get(commandArr[1]);
                        if (spellbook.contains(commandArr[2])) {
                            System.out.printf("%s has already learnt %s.%n", commandArr[1], commandArr[2]);
                        } else {
                            spellbook.add(commandArr[2]);
                            heroesMap.put(commandArr[1], spellbook);
                        }
                    }
                    break;
                case "Unlearn":
                    if (!heroesMap.containsKey(commandArr[1])) {
                        System.out.printf("%s doesn't exist.%n", commandArr[1]);
                    } else {
                        List<String> spellbook = heroesMap.get(commandArr[1]);

                        if (!spellbook.contains(commandArr[2])) {
                            System.out.printf("%s doesn't know %s.%n", commandArr[1], commandArr[2]);
                        } else {
                            spellbook.remove(commandArr[2]);
                            heroesMap.put(commandArr[1], spellbook);
                        }
                    }
                    break;
            }
            commandArr = scanner.nextLine().split(" ");
        }

        System.out.println("Heroes:");
        for (Map.Entry<String, List<String>> hero:heroesMap.entrySet()) {
            System.out.printf("== %s:", hero.getKey());

            StringBuilder spellsText = new StringBuilder();
            for (String spell:hero.getValue()) {
                spellsText.append(" " + spell + ",");
            }
            if (spellsText.length() > 0) {
                spellsText.setLength(spellsText.length() - 1);
            }
            System.out.printf("%s%n", spellsText);
        }
    }
}
