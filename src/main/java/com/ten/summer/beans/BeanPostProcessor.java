package com.ten.summer.beans;

public interface BeanPostProcessor {

	Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

	Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;

}