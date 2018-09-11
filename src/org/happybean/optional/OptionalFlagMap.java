package org.happybean.optional;

import java.util.Optional;

import static org.happybean.optional.OptionalEmpty.createEmptyOptional;
import static org.happybean.optional.OptionalOf.stringConvertToOptional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description flagMap:如果创建的Optional中的值存在，就对该值执行提供的Function函数调用，返回一个Optional类型的值，否则就返回一个空的Optional对象
 * <p>
 * flatMap与map（Funtion）方法类似，区别在于flatMap中的mapper返回
 * 值必须是Optional，map方法的mapping函数返回值可以是任何类型T。调用结束时，flatMap不会对结果用Optional封装。
 * </p>
 **/
public class OptionalFlagMap {

    public static void main(String[] args) {

        Optional<String> optionalStr = stringConvertToOptional("java1.8 Optional");
        printOptionalFlagMap(optionalStr);

        Optional optionalEmpty = createEmptyOptional();
        printOptionalFlagMap(optionalEmpty);
    }

    public static void printOptionalFlagMap(Optional optional) {

        System.out.println("optional.flatMap:" + optional.flatMap(o -> Optional.of("optional flatMap")).orElse("failed"));
    }
}
