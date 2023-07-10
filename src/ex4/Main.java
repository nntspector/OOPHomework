package ex4;

import ex4.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Пример использования методов класса Calculator
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Сумма чисел
        Double sumResult = calculator.sum(numbers);
        System.out.println("Sum: " + sumResult);

        // Умножение чисел
        Double multiplyResult = calculator.multiply(numbers);
        System.out.println("Multiplication: " + multiplyResult);

        // Деление чисел
        Number dividend = 10;
        Number divisor = 2;
        Double divideResult = calculator.divide(dividend, divisor);
        System.out.println("Division: " + divideResult);

        // Бинарный перевод числа
        Number binaryNumber = 15;
        String binaryConversionResult = calculator.binaryConversion(binaryNumber);
        System.out.println("Binary Conversion: " + binaryConversionResult);
    }
}
