package com.some;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class HWInit {
//WebApplicationInitializer
//    @Override
    public void onStartup(ServletContext container) throws ServletException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(HWConfig.class);
        context.setServletContext(container);
        context.refresh();

        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet());
        servlet.setLoadOnStartup(0);
        servlet.addMapping("/");
    }
}
