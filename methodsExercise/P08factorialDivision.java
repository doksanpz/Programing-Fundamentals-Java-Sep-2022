package methodsExercise;

import java.util.Scanner;

public class P08factorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long fact1 = calculateFactorial(number1); //факториел на 1во число
        long fact2 = calculateFactorial(number2); //факториел на 2ро число

        double divisionResult = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", divisionResult);
    }
    public static long calculateFactorial(int number){  //променлива от тип long защото търсим факториел, а той може да е мн голямо число
        long fact = 1; //стойноста на факториела, стойност 1 защото ще участва в умножения, не може 0 !!!
        for (int i = 1; i <= number; i++) {
            fact = fact * i;   //намираме факториела
        }
        return fact;
    }
}
