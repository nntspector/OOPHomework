package ex5;
/*
Создать информационную систему позволяющую работать с сотрудниками некой компании \ студентами вуза \ учениками школы
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иван", 30, "E001");
        Student student = new Student("Анна", 20, "S001");
        SchoolStudent schoolStudent = new SchoolStudent("Максим", 15, "SS001", "Школа №1");

        System.out.println("Имя ученика: " + employee.getName());
        System.out.println("Возраст ученика: " + student.getAge());
        System.out.println("Номер ученика школы: " + schoolStudent.getStudentId());
        System.out.println("Название школы: " + schoolStudent.getSchoolName());
    }
}

