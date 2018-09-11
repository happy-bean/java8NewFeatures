package org.happybean.optional;

import java.util.Optional;

import static org.happybean.optional.OptionalEmpty.createEmptyOptional;
import static org.happybean.optional.OptionalOf.stringConvertToOptional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description orElseThrow:如果创建的Optional中有值存在，则返回此值，否则抛出一个由指定的Supplier接口生成的异常
 **/
public class OptionalOrElseThrow {

    public static void main(String[] args) throws Throwable {

        Optional<String> optionalStr = stringConvertToOptional("java1.8 Optional");
        printOptionalOrElseThrow(optionalStr);

        Optional optionalEmpty = createEmptyOptional();
        printOptionalOrElseThrow(optionalEmpty);
    }

    public static void printOptionalOrElseThrow(Optional optional) throws Throwable {

        System.out.println("optional.orElseThrow:" + optional.orElseThrow(OrElseException::new));
    }


    private static class OrElseException extends RuntimeException {

        private static final long serialVersionUID = -4399699891687593264L;

        public OrElseException() {

            super("OrElse exception");
        }

        public OrElseException(String message) {

            super(message);
        }
    }
}

