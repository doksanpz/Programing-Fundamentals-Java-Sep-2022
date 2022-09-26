package dataTypeExercise;

import java.util.Scanner;

public class P04sumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSymbols = Integer.parseInt(scanner.nextLine());

        int sum = 0;  // сума от кодовете
        for (int symbol = 1; symbol <= countSymbols; symbol++) {
            char value = scanner.nextLine().charAt(0);
            int code = (int) value; // намираме АСКИ кода на символа
            sum += code; // добавяме стойността на кода към сумата
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
