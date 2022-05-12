package List_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {

    private static void sumAndPrint(List<Integer> playerWinner, String player) {
        int sum = 0;
        for (int element : playerWinner)
            sum += element;
        System.out.println(player + " player wins! Sum: " + sum);
    }

    private static void compareCards(List<Integer> winnerList, List<Integer> loserList, boolean isCardSame) {
        if (!isCardSame) winnerList.add(winnerList.get(0));
        if (!isCardSame) winnerList.add(loserList.get(0));
        winnerList.remove(0);
        loserList.remove(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (playerOne.size() > 0 && playerTwo.size() > 0) {

            if (playerOne.get(0) > playerTwo.get(0))         // one is bigger
                compareCards(playerOne, playerTwo, Objects.equals(playerOne.get(0), playerTwo.get(0)));

            else if (playerOne.get(0) < playerTwo.get(0))    // two is bigger
                compareCards(playerTwo, playerOne, Objects.equals(playerOne.get(0), playerTwo.get(0)));

            else if (Objects.equals(playerOne.get(0), playerTwo.get(0)))  // same values
                compareCards(playerOne, playerTwo, Objects.equals(playerOne.get(0), playerTwo.get(0)));
        }
        if (playerOne.size() > 0)
            sumAndPrint(playerOne, "First");
        else if (playerTwo.size() > 0)
            sumAndPrint(playerTwo, "Second");
    }
}