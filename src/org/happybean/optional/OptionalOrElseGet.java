package org.happybean.optional;

import java.util.Optional;

import static org.happybean.optional.OptionalEmpty.createEmptyOptional;
import static org.happybean.optional.OptionalOf.stringConvertToOptional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description orElseGet:如果创建的Optional中有值存在，则返回此值，否则返回一个由Supplier接口生成的值
 **/
public class OptionalOrElseGet {

    public static void main(String[] args) {

        Optional<String> optionalStr = stringConvertToOptional("java1.8 Optional");
        printOptionalOrElseGet(optionalStr);

        Optional optionalEmpty = createEmptyOptional();
        printOptionalOrElseGet(optionalEmpty);
    }

    public static void printOptionalOrElseGet(Optional optional) {

        System.out.println("optional.orElseGet:" + optional.orElseGet(()->"Optional orElseGet"));
    }
}
