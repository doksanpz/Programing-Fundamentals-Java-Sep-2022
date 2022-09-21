package BasicSyntaxExercise;

import java.util.Scanner;

public class P11rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = lostGames / 2;
        int countMouse = lostGames / 3;
        int countKeyboards = lostGames / 6;
        int countDisplay = lostGames / 12;

        double finalSum = (countHeadset * headSetPrice)
                + (countMouse * mousePrice)
                + (countKeyboards * keyboardPrice)
                + (countDisplay * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", finalSum);
    }
}
