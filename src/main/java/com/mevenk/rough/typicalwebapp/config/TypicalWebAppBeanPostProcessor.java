/**
 * 
 */
package com.mevenk.rough.typicalwebapp.config;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Venkatesh
 *
 */
public class TypicalWebAppBeanPostProcessor implements BeanPostProcessor {

	private static final Logger log = LogManager.getLogger(TypicalWebAppBeanPostProcessor.class);
	private static final Level CONFIG = TypicalWebAppLogger.CONFIG;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#
	 * postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		log.log(CONFIG, "Initializing " + bean);
		return bean;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#
	 * postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		log.log(CONFIG, "Initialized " + bean);
		return bean;
	}

}
