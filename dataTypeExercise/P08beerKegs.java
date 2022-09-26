package dataTypeExercise;

import java.util.Scanner;

public class P08beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE; // задаваме възможно най малкото число, за да намерим макс стойност
        String maxModelKeg = " ";  // името на мксималния кег, задаваме му празен стринг
        for (int keg = 1; keg <= countKegs ; keg++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius,2) * height; //Math.pow повдига променлива на степен, първо променливата после степента

            if (volume > maxVolume) {   // дали дадения обем е > от максималния
                maxVolume = volume;
                maxModelKeg = kegModel;
            }
        }
        System.out.println(maxModelKeg);
    }
}
