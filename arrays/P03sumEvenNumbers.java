package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   //    String inputLine = scanner.nextLine();
   //     String[] inputArr = scanner.nextLine().split(" "); // четем масива от конзолата и разделяме символите
   //     int[] numsArr = new int[inputArr.length]; // създаваме инт масив с дължина стринг масива
   //
   //     for (int i = 0; i < numsArr.length; i++) {
   //         numsArr[i]  = Integer.parseInt(inputArr[i]); //парсваме текущия елемент към масива
   //
        // }

        int[] numbersArr = Arrays           // превръщаме стринг масив в инт и го четем от конзолата
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;    // създаваме променлива за четните числа
        for (int i = 0; i < numbersArr.length; i++) {
            int currentElement = numbersArr[i]; // създаваме променлива за текущият елемент
            if (currentElement % 2 == 0) { //проверяваме дали текущият елемен е четен
               evenSum += currentElement;  // добавяме към променливата текущия елемент
            }
        }
        System.out.println(evenSum);
    }
}
