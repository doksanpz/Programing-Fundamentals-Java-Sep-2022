package regularExpressionExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furnitureNames = new ArrayList<>();
        double totalSum = 0;

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        while (!input.contains("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furnitureName = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureNames.add(furnitureName);
                double currentPrice = price * quantity;
                totalSum += currentPrice;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureNames.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
