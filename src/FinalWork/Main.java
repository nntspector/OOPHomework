package FinalWork;

/*
Cоздать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
Соблюдать принципы SOLID, паттерны проектирования.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new ComplexCalculator();
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, -2);

        CalculatorLogger.log("Результат сложения: " + calculator.add(num1, num2));
        CalculatorLogger.log("Результат умножения: " + calculator.multiply(num1, num2));
        try {
            CalculatorLogger.log("Результат деления: " + calculator.divide(num1, num2));
        } catch (ArithmeticException e) {
            CalculatorLogger.log(e.getMessage());
        }
    }
}

/*
В этом проекте применены следующие принципы SOLID и паттерны проектирования:

Принцип единственной ответственности (Single Responsibility Principle):
Класс ComplexNumber отвечает только за представление комплексных чисел, класс ComplexCalculator отвечает
только за операции с комплексными числами, а класс CalculatorLogger отвечает только за логирование калькулятора.

Принцип открытости/закрытости (Open-Closed Principle):
Класс ComplexCalculator открыт для расширения, так как мы можем добавить новые операции с комплексными числами,
 не изменяя его код.

Принцип подстановки Барбары Лисков (Liskov Substitution Principle):
Класс ComplexCalculator использует абстракцию Calculator для выполнения операций с комплексными числами,
что позволяет нам без проблем использовать другие реализации калькулятора, например, для обычных чисел.

Принцип разделения интерфейса (Interface Segregation Principle):
Интерфейс Calculator предоставляет только те методы, которые необходимы для работы с комплексными числами,
 что позволяет избежать ненужной зависимости от функциональности, которая не используется.

Принцип инверсии зависимостей (Dependency Inversion Principle):
Класс ComplexCalculator зависит от абстракции Calculator, а не от конкретных реализаций, что делает систему
гибкой и расширяемой.

Также добавлено простое логирование калькулятора с использованием класса CalculatorLogger.
 */