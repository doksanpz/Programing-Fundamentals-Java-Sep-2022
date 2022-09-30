package arrays;

import java.util.Scanner;

public class P04reverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" "); //четем масив от конзолата и разделяле елементите

        for (int i = 0; i < inputArr.length / 2; i++) {   // намаляваме операцийте двойно, защото ще заменяме символи до средата на масива
            String oldElement = inputArr[i]; //запазваме стойността на 1ви елемент
            inputArr[i] = inputArr[inputArr.length - 1 - i]; //първия елемент от масива пресвоява стойността на последния
            inputArr[inputArr.length - 1 - i] = oldElement; // пресвояваме стойноста на 1ви елемен и го правим последен
        }
        System.out.println(String.join(" ", inputArr)); //принтираме като обединяваме символите в масива
    }
}
