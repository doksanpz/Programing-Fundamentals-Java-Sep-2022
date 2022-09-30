package arrays;

import java.util.Scanner;

public class P02printNumbersInReversOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersArr = new int[n];       // създаваме масив с бр. числа толкова колкото четем и от конзолата
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());  // четем толкова бр числа, колкото сме задали в конзолата

            numbersArr[i] = currentNum; // добавяме прочетеното число горе като стойност към масива
        }

        for (int i = numbersArr.length - 1; i >= 0; i--) {   // създаваме обратен цикъл, започваме от последната позиция (декрементиране)
            System.out.printf("%d ", numbersArr[i]);  // принтираме елемента на позиция i от масива
        }
    }
}
