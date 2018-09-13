package org.happybean.annotation;

import java.lang.annotation.Repeatable;

/**
 * @author wgt
 * @date 2018-09-13
 * @description Java8中支持多重注解
 **/
@interface Hints {
    Hint[] value();
}

@Repeatable(Hints.class)
@interface Hint {
    String value();
}

@Hints(value = {@Hint("hint1"), @Hint("hint2")})
class Demo1 {
}

@Hint(value = "hint1")
@Hint(value = "hint2")
class Demo2 {
}

class Main{

    public static void main(String[] args) {

        Hint hint = Demo1.class.getAnnotation(Hint.class);
        System.out.println(hint);

        Hints hints1 = Demo1.class.getAnnotation(Hints.class);
        System.out.println(hints1);

        Hint[] hints2 = Demo2.class.getAnnotationsByType(Hint.class);
        System.out.println(hints2.length);
        //TODO
    }
}
