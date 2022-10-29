package objectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class P03bigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger resultBigNum = new BigInteger(String.valueOf(1)); // превръщаме примитивния тип данни в референтен

        for (int i = 1; i <= n ; i++) {
            resultBigNum = resultBigNum.multiply(BigInteger.valueOf(i));  // превръщаме примитивния тип данни в референтен
        }
        System.out.println(resultBigNum);
    }
}
