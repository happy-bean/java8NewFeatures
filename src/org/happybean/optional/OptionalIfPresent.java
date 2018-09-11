package org.happybean.optional;

import java.util.Optional;

import static org.happybean.optional.OptionalOf.stringConvertToOptional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description ifPresent:如果创建的Optional中的值存在，则执行该方法的调用，否则什么也不做
 **/
public class OptionalIfPresent {

    public static void main(String[] args) {

        Optional<String> optionalStr = stringConvertToOptional("java1.8 Optional");
        optionalIfPresent(optionalStr);

        Optional optionalEmpty = Optional.ofNullable(null);
        optionalIfPresent(optionalEmpty);
    }

    public static void optionalIfPresent(Optional optional) {

        optional.ifPresent(o ->{ System.out.println("optional:"+optional);});
    }
}
