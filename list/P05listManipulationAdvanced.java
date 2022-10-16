package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        distribution(scanner, numsList);

    }

    private static void distribution(Scanner scanner, List<Integer> numsList) {
        String input = "";

        while (!(input = scanner.nextLine()).equals("end")) {

            String[] command = input.split(" ");
            int number;

            switch (command[0]) {
                case "Contains":
                    number = Integer.parseInt(command[1]);
                    containsNumber(numsList, number);
                    break;
                case "Print":
                    if (command[1].equals("even")) {
                        printEvenNums(numsList);
                    } else {
                        printOddNums(numsList);
                    }
                    break;
                case "Get":
                    printSumOfNums(numsList);
                    break;
                case "Filter":
                    number = Integer.parseInt(command[2]);
                    filterNums(numsList, command[1], number);

            }
        }
    }

    private static void containsNumber(List<Integer> numsList, int number) {

        if (numsList.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    private static void printEvenNums(List<Integer> numsList) {

        for (int num : numsList) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printOddNums(List<Integer> numsList) {

        for (int num : numsList) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printSumOfNums(List<Integer> numsList) {

        int sum = 0;
        for (int num : numsList) {
            sum += num;
        }
        System.out.println(sum);
    }

    private static void filterNums(List<Integer> numsList, String condition, int number) {

        switch (condition) {
            case "<":
                for (int num : numsList) {
                    if (num < number) {
                        System.out.print(num + " ");
                    }
                }
                break;
            case ">":
                for (int num : numsList) {
                    if (num > number) {
                        System.out.print(num + " ");
                    }
                }
                break;
            case ">=":
                for (int num : numsList) {
                    if (num >= number) {
                        System.out.print(num + " ");
                    }
                }
                break;
            case "<=":
                for (int num : numsList) {
                    if (num <= number) {
                        System.out.print(num + " ");
                    }
                }
                break;
        }
        System.out.println();
    }
    }

