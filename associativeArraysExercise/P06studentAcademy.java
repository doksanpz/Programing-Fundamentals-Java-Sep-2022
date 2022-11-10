package associativeArraysExercise;

import java.util.*;

public class P06studentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();  //създаваме мап където държим името и лист със оценките

        int countStudents = Integer.parseInt(scanner.nextLine());  // бр студенти

        for (int i = 1; i <= countStudents; i++) {  //обхождаме вс студенти
            String name = scanner.nextLine();     // име на студента
            double grade = Double.parseDouble(scanner.nextLine()); // оценка на студента

            if (!studentsGrade.containsKey(name)) {  //ако студента не е  записан го записваме
                studentsGrade.put(name, new ArrayList<>()); //записваме студента с празен списък към него
            }
            studentsGrade.get(name).add(grade);  //добавяме си оценката на дадения студент, към списъка с оценки(листа, защото не е само 1 оценка)
        }

        Map<String, Double> averageGradeStudents = new LinkedHashMap<>(); // създаваме нов мап за средната оценка

        for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {   // обхождаме мапа като му взимаме съвкупноста от записите(entrySet)
            List<Double> listGrades = entry.getValue(); // списък с оценки за всеки студент
            double averageGrade = getAverageGrade(listGrades);    //създаваме метод за средно аритметично
            if (averageGrade >= 4.50) {   // ако ср оценка на студента  е по голяма от 4,50
                averageGradeStudents.put(entry.getKey(), averageGrade); // съхраняваме името на студента в мапа и ср оценка
            }
        }
        averageGradeStudents.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
        //отпечатваме форматирано мапа с entrySet(името е ключа, средната оценка е value)
    }

    private static double getAverageGrade(List<Double> listGrades) {
        double sumGrades = 0;  // променлива в която държим сумата
        for(double grade : listGrades) {  //for цикъл за да намерим сумата на оценките
            sumGrades += grade;
        }
        return sumGrades/ listGrades.size();
        //метода връща сумата разделена на дължината на листа(който е и броя на оценките), така намираме средно аритметично
    }
}
