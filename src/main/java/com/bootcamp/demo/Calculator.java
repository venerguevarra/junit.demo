package com.bootcamp.demo;

import static java.lang.Integer.parseInt;

public class Calculator {
    public int computeSum(int x, int y) {
        return x + y;
    }

    public int computeSum(String x, String y) {
        try {
            int num1 = parseInt(x);
            int num2 = parseInt(y);
            return this.computeSum(num1, num2);
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
