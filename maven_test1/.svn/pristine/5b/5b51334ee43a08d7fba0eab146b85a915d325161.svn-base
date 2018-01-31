package com.cisdi.business.common.annotation;

import java.lang.annotation.*;

/**
 * 异常日志注解
 * @author chenj
 *
 * 2017年11月2日21:34:13
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogService {

    /**
     * @return 模块信息
     */
    String module() default "";

    /**
     * @return 描述信息
     */
    String description() default "";
    
    /**
     * @return 客户端种类
     */
    String clientType() default "";
}
