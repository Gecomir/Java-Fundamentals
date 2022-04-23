package Text_exercises;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String file = scanner.nextLine();

        String fileName = file.substring(file.lastIndexOf("\\") + 1, file.indexOf("."));
        String fileExtension = file.substring(file.indexOf(".") + 1);
        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", fileExtension);
    }
}
