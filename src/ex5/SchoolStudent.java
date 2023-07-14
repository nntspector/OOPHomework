package ex5;

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

