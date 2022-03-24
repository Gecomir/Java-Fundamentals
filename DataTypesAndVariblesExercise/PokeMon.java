package DataTypesAndVaribles_Exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        double halfN = N * 0.50;
        int target = 0;
        while (N >= M) {
            N -= M;
            target++;
            if (N == halfN && Y != 0) {
                N /= Y;
            }
        }
        System.out.println(N);
        System.out.println(target);
    }
}
