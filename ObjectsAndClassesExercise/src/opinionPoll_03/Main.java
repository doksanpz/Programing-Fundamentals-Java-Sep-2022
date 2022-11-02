package opinionPoll_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());  //брой редове с лична информация

        for (int row = 1; row <= n ; row++) {          //обхождаме редовете
            String data = scanner.nextLine();          //четем информацията от конзолата
            String name = data.split(" ")[0];    //взимаме името от конзолата
            int age = Integer.parseInt(data.split(" ")[1]); //взимаме възрастта

            if (age > 30) {
                //създавам запис за човека -> съхранявам този запис
                Person person = new Person(name, age);
                personList.add(person);
            }
        }

        for (Person person:personList) {        //отпечатваме  с foreach
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
