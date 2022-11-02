package students_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int studentCount = 1; studentCount <= countStudents ; studentCount++) {
            String data = scanner.nextLine();
            String[] dataParts = data.split(" ");
            String firstname = dataParts[0];
            String lastname = dataParts[1];
            double grade = Double.parseDouble(dataParts[2]);

            Student student = new Student(firstname, lastname, grade);  //запазваме обектите в лист
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());  // подреждаме по оценка от най - голяма към най – малка
        for (Student student : studentList) {
            System.out.println(student);   // обекта се преобразува с override toString
        }
    }
}
