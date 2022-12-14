package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= rotations ; rotation++) {
            int firstElement = numbers[0];   // първият елемент от масива
            for (int index = 0; index < numbers.length - 1; index++) {  //обхождаме вс елементи без последния
                numbers[index] = numbers[index + 1];     //преместваме елемента с един напред
            }
            numbers[numbers.length - 1] = firstElement; //слагаме първият елемент на последна позиция
        }
        for (int number : numbers) {                   //отпечатваме всяко едно число
            System.out.print(number + " ");
        }
    }
}
