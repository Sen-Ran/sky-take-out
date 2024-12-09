package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解,用于标识某个方法需要进行功能字段的自动填充处理
 */
@Target(ElementType.METHOD) //指定这个注解只能添加到方法上
@Retention(RetentionPolicy.RUNTIME) //默认写法
public @interface AutoFill {
    /**
     * 指定数据库操作类型:INSERT,UPDATE
     * @return
     */
    OperationType value();

}
