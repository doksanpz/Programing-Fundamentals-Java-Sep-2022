package arrays;

import java.util.Locale;
import java.util.Scanner;

public class P01dayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfWeekArr = {            // хардкор на масива = директно му задаваме стойности
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 1 && n <= 7) {
            System.out.println(dayOfWeekArr[n - 1]);    // ден от седмицата -1 защото масива започва от 0 позиция
        } else {
            System.out.println("Invalid day!");
        }
    }
}
