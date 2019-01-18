package com.zlqian.spring.demo1;

import com.zlqian.spring.Hello;

/**
 * @author qianzhaoliang
 * @since 2019/01/17
 */
public class HelloService implements Hello {
    @Override
    public void sayHello() {
        System.out.println("helloService");
    }
}
