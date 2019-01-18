package com.zlqian.spring.demo2;

import com.zlqian.spring.Hello;
import org.springframework.stereotype.Service;

/**
 * @author qianzhaoliang
 * @since 2019/01/17
 */
@Service
public class HelloService implements Hello {

    @Override
    public void sayHello() {
        System.out.println("Demo2: helloService");
    }
}
