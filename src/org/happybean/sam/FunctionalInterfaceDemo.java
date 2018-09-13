package org.happybean.sam;

/**
 * @author wgt
 * @date 2018-09-13
 * @description 函数式接口:首先是一个接口，然后就是在这个接口里面只能有一个抽象方法。
 * 这种类型的接口也称为SAM接口，即Single Abstract Method interfaces
 **/
@FunctionalInterface
interface FunctionalInterfaceDemo {

    void functionalInterfaceMethod();
}

class Main {

    public static void main(String[] args) {

        FunctionalInterfaceDemo demo = ()-> System.out.println("functional interface");
        demo.functionalInterfaceMethod();
    }
}
