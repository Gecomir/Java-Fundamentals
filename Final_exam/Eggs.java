import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "(@|#)+(?<color>\\b[a-z]{3,})(@|#)+([^a-zA-z0-9]+)?\\/+(?<count>[0-9]+)\\/+";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("You found " + matcher.group("count") + " " + matcher.group("color") + " eggs!");
        }
    }
}
