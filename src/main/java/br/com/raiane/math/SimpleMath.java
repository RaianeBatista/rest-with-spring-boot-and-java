package br.com.raiane.math;

import br.com.raiane.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {
    public Double sum(Double numberOne, Double numberTwo) throws Exception {
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public double mean(Double numberOne, Double numberTwo) {
        double sum = numberOne + numberTwo;
        return sum / 2;
    }

    public double squareRoot(Double number) {
        return Math.sqrt(number);
    }
}
