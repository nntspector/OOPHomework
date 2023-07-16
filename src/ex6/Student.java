package ex5;

// Принцип: Liskov Substitution Principle (Принцип подстановки Лисков)
// Класс Student также расширяет класс Person, сохраняя контракт базового класса

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}

