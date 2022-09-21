package BasicSyntaxExercise;

import java.util.Scanner;

public class P06strongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number; // първоначално въведената стойност на числото, защото въведеното число се модифицира в цикъла

        int sumFact = 0;
        while (number > 0) {
            int lastDigit = number % 10; // последна цифра
            int fact = 1;                // намираме факториела
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            sumFact += fact;            // сумираме факториела
            number = number / 10 ; // премахваме последната цифра
        }
        if (sumFact == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
