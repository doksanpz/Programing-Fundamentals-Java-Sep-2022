package dataTypeExercise;

import java.util.Scanner;

public class P11snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBalls = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        int maxSnow = Integer.MIN_VALUE;
        int maxTime = Integer.MIN_VALUE;
        int maxQuality = Integer.MIN_VALUE;
        for (int ball = 1; ball <= countBalls ; ball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                maxSnow = snowballSnow;
                maxTime = snowballTime;
                maxQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, maxValue,maxQuality);
    }
}
