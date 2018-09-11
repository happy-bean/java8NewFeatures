package org.happybean.optional;

import java.util.Optional;

import static org.happybean.optional.OptionalEmpty.createEmptyOptional;
import static org.happybean.optional.OptionalOf.stringConvertToOptional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description filter:如果创建的Optional中的值满足filter中的条件，则返回包含该值的Optional对象，否则返回一个空的Optional对象
 **/
public class OptionalFilter {

    public static void main(String[] args) {

        Optional<String> optionalStr = stringConvertToOptional("java1.8 Optional");
        printOptionalFilter(optionalStr);

        Optional optionalEmpty = createEmptyOptional();
        printOptionalFilter(optionalEmpty);
    }

    public static void printOptionalFilter(Optional<String> optional) {

        System.out.println(optional.filter(o -> o.length() > 5).orElse("length < = 5"));
    }
}
