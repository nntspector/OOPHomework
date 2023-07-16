package ex5;
// Принцип: Single Responsibility Principle (Принцип единственной ответственности)
// Класс Person отвечает только за предоставление информации о человеке
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

