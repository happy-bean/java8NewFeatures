package org.happybean.lambda;

/**
 * @author wgt
 * @date 2018-09-11
 * @description lambda计算器
 **/
public class Calculator {

    public static void main(String[] args) {

        int num1 = 2, num2 = 1;

        MathMethod add = (a, b) -> a + b;
        printMathMethodResult(num1, num2, add);

        MathMethod minus = (a, b) -> a - b;
        printMathMethodResult(num1, num2, minus);

        MathMethod multiply = (a, b) -> a * b;
        printMathMethodResult(num1, num2, multiply);

        MathMethod divide = (a, b) -> a / b;
        printMathMethodResult(num1, num2, divide);
    }

    interface MathMethod {

        int operation(int a, int b);
    }

    public static void printMathMethodResult(int a, int b, MathMethod method) {

        System.out.println(method.operation(a, b));
    }
}
