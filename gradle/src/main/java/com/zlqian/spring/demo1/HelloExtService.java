package com.zlqian.spring.demo1;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author qianzhaoliang
 * @since 2019/01/17
 */
public class HelloExtService extends HelloService {
    @Value("${abc}")
    private String value;

    @Override
    public void sayHello() {
        System.out.println("HelloExtService: " + value);
    }
}
