package org.happybean.defaults;

/**
 * @author wgt
 * @date 2018-09-13
 * @description java8允许我们给接口添加一个非抽象的方法实现，只需要使用 default关键字即可，这个特征又叫做扩展方法
 **/
interface Formula {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

class Main {

    public static void main(String[] args) {

        Formula formula = (a -> a / 100);

        System.out.println(formula.calculate(100));

        System.out.println(formula.sqrt(100));
    }
}