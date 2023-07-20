package FinalWork;

public class ComplexCalculator implements Calculator {
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double realSum = num1.getReal() + num2.getReal();
        double imaginarySum = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(realSum, imaginarySum);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realProduct = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryProduct = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realProduct, imaginaryProduct);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) throws ArithmeticException {
        double denominator = Math.pow(num2.getReal(), 2) + Math.pow(num2.getImaginary(), 2);
        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        double realQuotient = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginaryQuotient = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(realQuotient, imaginaryQuotient);
    }

}

