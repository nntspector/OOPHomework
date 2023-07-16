package ex5;
/*
Создать информационную систему позволяющую работать с сотрудниками некой компании \ студентами вуза \ учениками школы
 */
public class Main {
    public static void main(String[] args) {
        // Принцип: Dependency Inversion Principle (Принцип инверсии зависимостей)
        // Вместо прямой зависимости от конкретных классов, мы используем абстракции (Person, Employee, Student)
        // и работаем с ними через общий интерфейс
        Employee employee = new Employee("Иван", 30, "E001");
        Student student = new Student("Анна", 20, "S001");
        SchoolStudent schoolStudent = new SchoolStudent("Максим", 15, "SS001", "Школа №1");

        System.out.println("Имя ученика: " + employee.getName());
        System.out.println("Возраст ученика: " + student.getAge());
        System.out.println("Номер ученика школы: " + schoolStudent.getStudentId());
        System.out.println("Название школы: " + schoolStudent.getSchoolName());
    }
}

/*Класс Person соответствует принципу единственной ответственности, так как он отвечает только за предоставление
информации о человеке.
Классы Employee, Student и SchoolStudent соответствуют принципу открытости/закрытости, так как они расширяют базовый
класс Person, добавляя свои собственные свойства и методы, но не изменяют его код.
Класс SchoolStudent соответствует принципу разделения интерфейса, так как он использует только методы и свойства,
необходимые для школьного ученика.
В методе main() мы видим применение принципа инверсии зависимостей. Вместо прямой зависимости от конкретных классов
 (Employee, Student, SchoolStudent), мы используем абстракцию Person и работаем с ней через общий интерфейс.*/