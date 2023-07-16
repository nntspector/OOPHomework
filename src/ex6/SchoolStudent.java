package ex5;
// Принцип: Interface Segregation Principle (Принцип разделения интерфейса)
// Класс SchoolStudent использует только методы и свойства, необходимые для школьного ученика

public class SchoolStudent extends Student {
    private String schoolName;

    public SchoolStudent(String name, int age, String studentId, String schoolName) {
        super(name, age, studentId);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }
}

