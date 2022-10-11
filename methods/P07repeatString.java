package methods;

import java.util.Scanner;

public class P07repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(n, inputText));
    }
    public static String repeatString (int n, String text) {
        StringBuilder result = new StringBuilder();
        result.append(String.valueOf(text).repeat(Math.max(0, n)));
        return result.toString();
    }
}
