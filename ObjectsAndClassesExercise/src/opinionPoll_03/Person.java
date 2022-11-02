package opinionPoll_03;

public class Person {
    //полета -> характеристики
    private String name;
    private int age;

    //конструктор -> създашаме обекти от класа
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    // методи -> поведение

    public String getName() {
        return  this.name;
    }
    public  int getAge() {
        return  this.age;
    }
}
