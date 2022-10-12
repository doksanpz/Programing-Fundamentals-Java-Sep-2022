package methodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class P02vowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printVowelsCount(text.toLowerCase());   // !!! текста да е само с малки букви
    }
    public static void printVowelsCount(String text) {
        int count = 0;    //броя на гласните
        for (char symbol:text.toCharArray()) {    // преобразуваме текста в масив от символи
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
            count++;
            }
        }
        System.out.println(count);
    }
}
