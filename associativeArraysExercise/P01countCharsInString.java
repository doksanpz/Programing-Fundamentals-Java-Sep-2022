package associativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01countCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", ""); //заменяме 1 или повече интервали с нищо (празен String)

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for(char symbol : text.toCharArray()) {  // .toCharArray  за да обходим всеки символ от текста(превръщаме го в масив от символи)
            if (!symbolsCount.containsKey(symbol)) { // ако в мапа не се съдържа символа(който ни е и ключа)
                symbolsCount.put(symbol, 1);
            } else {
               int currentCount = symbolsCount.get(symbol); //текущия бр. срещания
                symbolsCount.put(symbol, currentCount + 1);
            }
        }
        symbolsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        // entrySet() дава съвкупността от всички записи
        // с forEach обхождаме всяко едно ентри и отпечатваме неговия запис
    }
}
