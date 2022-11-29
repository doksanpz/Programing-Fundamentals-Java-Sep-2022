package finalExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P03plantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantAndRarityMap = new HashMap<>();
        Map<String, Double> rateMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);

            plantAndRarityMap.put(plant, rarity);
            rateMap.put(plant, 0.0);
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] tokens = input.split("[: -]+");
            String command = tokens[0];
            String plant = tokens[1];

            if (!plantAndRarityMap.containsKey(plant)) {
                System.out.println("error");
            } else {
                switch (command) {
                    case "Rate":
                        double rate = Double.parseDouble(tokens[2]);
                        if (rateMap.get(plant) == 0) {
                            rateMap.put(plant, rate);
                        } else {
                            double newRate = rateMap.get(plant) + rate / 2;
                            rateMap.put(plant, newRate);
                        }
                        break;
                    case "Update":
                        int rarity = Integer.parseInt(tokens[2]);
                        plantAndRarityMap.put(plant, rarity);
                        break;
                    case "Reset":
                        rateMap.put(plant, 0.0);
                        break;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantAndRarityMap.entrySet()) {
            System.out.printf(" - %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), rateMap.get(entry.getKey()));
        }

    }
}
