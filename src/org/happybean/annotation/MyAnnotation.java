package org.happybean.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author wgt
 * @date 2018-09-13
 * @description Java8的注解还增加到两种新的target
 **/
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@interface MyAnnotation {
}

