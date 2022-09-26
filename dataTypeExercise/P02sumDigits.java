package dataTypeExercise;

import java.util.Scanner;

public class P02sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0; // сумата на цифрите
        while (number > 0) {           // въртим цикъла докато числото не стане 0
            int lastDigit = number % 10; // взимаме последната цифра на числото
            sum += lastDigit; // добавяме последната цифра към сумата
            number = number / 10; // махаме последната цифра от числото
        }

        System.out.println(sum);
    }
}
