package methodsExercise;

import java.util.Scanner;

public class P07nxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int row = 1; row <= n; row++) {
            for (int colum = 1; colum <= n; colum++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
