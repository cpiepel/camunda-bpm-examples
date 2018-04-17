package org.camunda.bpm.spring.boot.example.autodeployment.config;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServiceLocator {

    private static AnnotationConfigApplicationContext beanFactory;

    private synchronized static BeanFactory getBeanFactory() {
        if (beanFactory == null) {
            beanFactory = new AnnotationConfigApplicationContext();
            beanFactory.setParent(ApplicationContextHolder.ctx);
            beanFactory.register(ExternalConfig.class);
            beanFactory.refresh();

        }


        return beanFactory;
    }

    public static String getStringBean() {
        return getBeanFactory().getBean("simpleStringBean", String.class);
    }


}
