package com.zlqian.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qianzhaoliang
 * @since 2019/01/17
 */
public class BeanTest {
    public static void main(String[] args) {
        testDemo3();
    }


    private static void testDemo3() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("gradle/bean3.xml");
        Hello service  = context.getBean("helloService", Hello.class);
        service.sayHello();
    }

    private static void testDemo1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("gradle/bean1.xml");

        Hello service = context.getBean("helloExtService2", Hello.class);
        service.sayHello();
    }

    private static void testDemo2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("gradle/bean2.xml");
        Hello service = context.getBean("helloService", Hello.class);
        service.sayHello();
    }


}
