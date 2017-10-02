/**
 * 
 */
package com.mevenk.rough.typicalwebapp.config;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mevenk.rough.typicalwebapp.bean.Student;

/**
 * @author Venkatesh
 *
 */
@Configuration
@PropertySource("${typicalWebappPropertiesFileSource}")
@EnableScheduling
@EnableWebMvc
@ComponentScan(basePackages = "com.mevenk.rough.typicalwebapprough")
@EnableAspectJAutoProxy
public class TypicalWebAppRootConfiguration {

	private static final String SIMPLE_DATE_FORMAT_SOURCE_BEAN_DATES_PATTERN = "dd/MM/yyyy-HH:mm:ss.SSS";
	public static final SimpleDateFormat SIMPLE_DATE_FORMAT_SOURCE_BEAN_DATES = new SimpleDateFormat(
			TypicalWebAppRootConfiguration.SIMPLE_DATE_FORMAT_SOURCE_BEAN_DATES_PATTERN);

	@Bean
	public TypicalWebAppBeanPostProcessor typicalWebAppBeanPostProcessor() {
		return new TypicalWebAppBeanPostProcessor();
	}

	private static final String BEAN_NAME_STUDENT = "student";

	@Bean(name = BEAN_NAME_STUDENT)
	@Scope(scopeName = SCOPE_PROTOTYPE)
	public Student student() {
		return new Student(BEAN_NAME_STUDENT, 25, "Venkatesh");
	}

}
