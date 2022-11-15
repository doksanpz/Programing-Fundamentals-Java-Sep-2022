package textProcessingExercise;

import java.util.Scanner;

public class P06replaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String rest = "";

        char firstOccur = input.charAt(0);
        rest += firstOccur;

        for (int i = 1; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol != firstOccur) {
                rest += currentSymbol;
                firstOccur = currentSymbol;
            }

        }

        System.out.println(rest);
    }
}
