package com.mk.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * This replaces the web.xml.
 * < ! DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

 <web-app id="WebApp_ID" version="2.4"
 xmlns="http://java.sun.com/xml/ns/j2ee"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee

 http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">

 <display-name>Archetype Created Web Application</display-name>

 <servlet>
 <servlet-name>dispatcher</servlet-name>
 <servlet-class>
 org.springframework.web.servlet.DispatcherServlet
 </servlet-class>
 <load-on-startup>1</load-on-startup>
 </servlet>

 <servlet-mapping>
 <servlet-name>dispatcher</servlet-name>
 <url-pattern>/</url-pattern>
 </servlet-mapping>

 <context-param>
 <param-name>contextConfigLocation</param-name>
 <param-value>/WEB-INF/dispatcher-servlet.xml</param-value>
 </context-param>

 <listener>
 <listener-class>
 org.springframework.web.context.ContextLoaderListener
 </listener-class>
 </listener>
 </web-app>
 *
 * @author kheriwalam5g
 * @since <version>
 */
public class WebInitializer implements WebApplicationInitializer {
  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
    ctx.register(WebMvcConfig.class);
    ctx.setServletContext(servletContext);
    ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
    servlet.addMapping("/");
    servlet.setLoadOnStartup(1);

  }
}
