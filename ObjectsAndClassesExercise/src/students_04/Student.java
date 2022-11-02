package students_04;

public class Student {
    private String name;
    private String lastname;
    private double grade;

    //конструктор
    public Student(String name, String lastname, double grade) {
        this.name = name;
        this.lastname = lastname;
        this.grade = grade;
    }
    //създаваме getter

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", this.name, this.lastname, this.grade);
    }
}
