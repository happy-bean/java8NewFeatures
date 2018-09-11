package org.happybean.lambda;

/**
 * @author wgt
 * @date 2018-09-11
 * @description lambada内部类使用
 **/
public class LambadaInterface {

    public static void init() {

        Test1 test = new Test1() {

            @Override
            public int method(int a, int b) {
                return a + b;
            }
        };

        Test1 test1 = (int a, int b) -> {

            return a + b;
        };

        Test1 test2 = (int a, int b) -> a + b;

        Test1 test3 = (a, b) -> {

            return a + b;
        };

        Test1 test4 = (a, b) -> a + b;

        Test2 test5 = (a) -> a + a;

        Test2 test6 = a -> a + a;

        Test3 test7 = (a, b) -> a.method(1, 2) + b.method(1);
    }

    interface Test1 {

        int method(int a, int b);
    }

    interface Test2 {

        int method(int a);
    }

    interface Test3 {

        int method(Test1 t1, Test2 t2);
    }
}


