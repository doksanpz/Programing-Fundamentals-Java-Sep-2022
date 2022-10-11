package methods;

import java.util.Scanner;

public class P05orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "coffee":
                double priceCoffee = 1.50;
                priceCoffee(quantity, priceCoffee);
                break;
            case "water":
                double priceWater = 1.00;
                priceWater(quantity, priceWater);
                break;
            case "coke":
                double priceCoke = 1.40;
                priceCoke(quantity, priceCoke);
                break;
            case "snacks":
                double priceSnacks = 2.00;
                priceSnacks(quantity, priceSnacks);
                break;
        }
    }
    public static void priceCoffee(int quantity, double price){
        System.out.printf("%.2f", quantity * price);
    }
    public static void priceWater(int quantity, double price){
        System.out.printf("%.2f", quantity * price);
    }
    public static void priceCoke(int quantity, double price){
        System.out.printf("%.2f", quantity * price);
    }
    public static void priceSnacks(int quantity, double price){
        System.out.printf("%.2f", quantity * price);
    }
}
