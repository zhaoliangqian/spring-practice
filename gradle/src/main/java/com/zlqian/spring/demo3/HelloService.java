package com.zlqian.spring.demo3;

import com.zlqian.spring.Hello;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author qianzhaoliang
 * @since 2019/01/17
 */
@Service
public class HelloService implements Hello {

    @Value("${abc}")
    private String value;

    @Override
    public void sayHello() {
        System.out.println("Demo3: " + value);
    }
}
