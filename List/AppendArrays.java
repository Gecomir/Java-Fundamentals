package List_exercises;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        List<String> output = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            String[] input = numbers.get(i).split("\\s+");
            for (int j = 0; j < input.length; j++) {
                if (!input[j].equals("")) {
                    output.add(input[j]);
                }
            }
        }
        System.out.println(String.join(" ",output));
    }
}

