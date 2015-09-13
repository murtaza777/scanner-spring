package com.mk.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import java.util.Properties;

/**
 * This class replaces the dispatcher-servlet.xml
 * <beans xmlns="http://www.springframework.org/schema/beans"
 xmlns:context="http://www.springframework.org/schema/context"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="
 http://www.springframework.org/schema/beans
 http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
 http://www.springframework.org/schema/context
 http://www.springframework.org/schema/context/spring-context-3.0.xsd">
   <context:component-scan base-package="com.javahash.spring.controller" />
   <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
     <property name="prefix">
       <value>/WEB-INF/views/</value>
     </property>
     <property name="suffix">
       <value>.jsp</value>
     </property>
   </bean>
 </beans>
 * @author kheriwalam5g
 * @since <version>
 */
//Marks this class as configuration
@Configuration
//Specifies which package to scan
@ComponentScan({"com.mk.config",
                //"com.mk.controller",
                "com.mk.service"})
//Enables Spring's annotations
@PropertySource("classpath:app.properties")
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/css/**").addResourceLocations("/css/");
    registry.addResourceHandler("/js/**").addResourceLocations("/js/");
  }

  @Bean
  public UrlBasedViewResolver setupViewResolver() {
    UrlBasedViewResolver resolver = new UrlBasedViewResolver();
    resolver.setPrefix("/WEB-INF/views/");
    resolver.setSuffix(".jsp");
    resolver.setViewClass(JstlView.class);
    return resolver;
  }

 /* @Bean
  public SimpleMappingExceptionResolver setupMappingExceptionResolver() {
    SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
    Properties mappings = new Properties();
    mappings.put("au.gov.ppsr.exception.PpsrException", "exceptionPage");
    resolver.setExceptionMappings(mappings);
    resolver.setDefaultErrorView("error");
    return resolver;
  }*/
}
