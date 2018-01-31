package com.cisdi.business.common.annotation;

import java.lang.annotation.*;

/**
 * 日志注解
 * @author admin
 *
 * 2018-01-02
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemLog {

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
    String clientType() default "0";
    
    /**
     * @return 业务类型
     */
    String businessType() default "";
}
