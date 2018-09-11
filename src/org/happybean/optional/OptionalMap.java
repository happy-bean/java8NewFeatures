package org.happybean.optional;

import java.util.Optional;

import static org.happybean.optional.OptionalEmpty.createEmptyOptional;
import static org.happybean.optional.OptionalOf.stringConvertToOptional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description map:如果创建的Optional中的值存在，对该值执行提供的Function函数调用
 **/
public class OptionalMap {

    public static void main(String[] args) {

        Optional<String> optionalStr = stringConvertToOptional("java1.8 Optional");
        printOptionalMap(optionalStr);

        Optional optionalEmpty = createEmptyOptional();
        printOptionalMap(optionalEmpty);
    }

    public static void printOptionalMap(Optional<String> optional) {

        System.out.println("optional.map:" + optional.map(o -> o.toUpperCase()).orElse("failed"));
    }
}
