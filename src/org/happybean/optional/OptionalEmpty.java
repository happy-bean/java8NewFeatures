package org.happybean.optional;

import java.util.Optional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description empty:创建一个空的Optional对象
 **/
public class OptionalEmpty {

    public static void main(String[] args) {

        Optional optionalEmpty = createEmptyOptional();
        System.out.println("optionalEmpty:" + optionalEmpty);
    }

    public static Optional createEmptyOptional() {

        Optional optional = Optional.empty();
        return optional;
    }
}
