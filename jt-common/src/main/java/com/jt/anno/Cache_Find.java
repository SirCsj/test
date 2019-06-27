package com.jt.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.jt.enu.KEY_ENUM;

@Retention(RetentionPolicy.RUNTIME)//程序运行时有效
@Target({ElementType.METHOD})//注解的作用范围
public @interface Cache_Find {
	String key() default "";//接收用户key值
	KEY_ENUM keyType() default KEY_ENUM.AUTO;//定义key类型
	int secondes() default 0;//永不失效
}
