package textProcessingExercise;

import java.util.Scanner;

public class P01validUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         //четем от конзолата
        String input = scanner.nextLine();
        String[] usernames = input.split(", ");
        // проверяваме дали username е валиден като обхождаме масива с foreach
        for (String username : usernames) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }
    //метод за проверка на username-а
    public static boolean isValidUsername(String username) {
        // валидна дължина
        boolean isValidLength = username.length() >= 3 && username.length() <= 16;
        //валидно съдържание

        for (char symbol : username.toCharArray()) {  //toCharArray за да го направим на масив от символи
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }

        return isValidLength;
    }
}
