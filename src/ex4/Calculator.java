package ex4;

import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    public Double multiply(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res *= number.doubleValue();
        }
        return res;
    }

    public Double divide(Number dividend, Number divisor) {
        if (divisor.doubleValue() == 0) {
            throw new IllegalArgumentException("Делить на 0 нельзя");
        }
        return dividend.doubleValue() / divisor.doubleValue();
    }

    public String binaryConversion(Number number) {
        if (number instanceof Double || number instanceof Float) {
            return Double.toHexString(number.doubleValue());
        } else {
            return Integer.toBinaryString(number.intValue());
        }
    }
}

