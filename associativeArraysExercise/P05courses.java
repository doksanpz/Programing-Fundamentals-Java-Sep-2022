package associativeArraysExercise;

import java.util.*;

public class P05courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courses.containsKey(course)) {  //ако нямаме курса го създаваме
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(studentName);  //добавяме студента към курса

           input = scanner.nextLine();
        }

        //courseName -> List<String>
        courses.entrySet()
                .forEach(entry -> {
                    //key: име на курса
                    //value: списък с хората
                    //име на курса -> бр. хората
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                    //ascending order / нарастващ ред
                });
    }
}
