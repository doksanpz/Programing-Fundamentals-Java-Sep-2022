package articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();    //четем данни от конзолата
        String[] articleParts = articleData.split(", "); //правим ги на масив, за да можем да ги достъпим

        String title = articleParts[0];
        String content = articleParts[1];      // достъпваме елементите от масива
        String author = articleParts[2];

        Article article = new Article(title, content, author);    //създаваме клас

        int n = Integer.parseInt(scanner.nextLine());   //броя на командите

        for (int commandCount = 1; commandCount <= n; commandCount++) {     //премионаваме през всички команди
            String command = scanner.nextLine();         // за всяка команда прочитаме нейният текст
            if (command.contains("Edit")) {
                String newContent = command.split(": ")[1];  // взимаме текста от командата
                article.edit(newContent);                          // добавяме текста като ново съдържание

            } else if (command.contains("Rename")) {
                String newTitle = command.split(": ")[1];
                article.rename(newTitle);

            } else if (command.contains("ChangeAuthor")) {
                String newAuthor = command.split(": ")[1];
                article.changeAuthor(newAuthor);
            }
        }

        System.out.println(article);
    }
}
