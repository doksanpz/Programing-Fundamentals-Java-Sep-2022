package textProcessingExercise;

import java.util.Scanner;

public class P07stringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);  //съхраняваме си входа в StringBuilder

        int totalStrength = 0;
        for (int position = 0; position < textBuilder.length(); position++) {
            char currentSymbol = textBuilder.charAt(position);

            if (currentSymbol == '>') {
                int explosionStrength = Integer.parseInt( textBuilder.charAt(position + 1) + "");
                // обединяваме char-а с  празен стринг, за да го превърнем в стринг
                totalStrength += explosionStrength;
            } else if (currentSymbol != '>' && totalStrength > 0) {
                textBuilder.deleteCharAt(position);
                totalStrength--;
                position--;
            }
        }
        System.out.println(textBuilder);
    }
}
