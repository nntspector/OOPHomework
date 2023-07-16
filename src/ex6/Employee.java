package ex5;
// Принцип: Open-Closed Principle (Принцип открытости/закрытости)
// Класс Employee расширяет базовый класс Person и добавляет свои собственные свойства и методы
public class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}

