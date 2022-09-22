package DataTypes;

import java.util.Scanner;

public class P05concatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String concatName = String.format("%s%s%s", firstName, delimiter, secondName);
        System.out.println(concatName);
    }
}
