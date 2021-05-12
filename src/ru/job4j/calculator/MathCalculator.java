package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDivAndDif(double first, double second) {
        return div(first, second)
                + dif(first, second);
    }

    public static double sumAndMultiplyAndDivAndDif(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + div(first, second)
                + dif(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат sumDifAndDiv равен: " + sumDivAndDif(10, 20));
        System.out.println("Результат sumAndMultiplyAndDifAndDiv равен: " + sumAndMultiplyAndDivAndDif(10, 20));
    }
}