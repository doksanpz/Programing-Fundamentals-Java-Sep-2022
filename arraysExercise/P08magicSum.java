package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbers.length - 1 ; index++) {      //обхождам вс числа от масива от 0 до последният
            int currentNumber = numbers[index];  //в тази променлива държим числото на текущия индекс
            for (int inIndex = index + 1; inIndex <= numbers.length - 1; inIndex++) { //втори цикъл с който обхождаме вс числа след текущото
                int inNumber = numbers[inIndex]; // вътрешно число

                if (currentNumber + inNumber == magicSum) {  //проверяваме дали сбора от двете числа е равен на магическото
                    System.out.println(currentNumber + " " + inNumber);  //отпечатваме двете числа
                }
            }
        }
    }
}
