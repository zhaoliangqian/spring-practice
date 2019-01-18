package com.zlqian.spring.demo2;

import org.springframework.stereotype.Service;

/**
 * @author qianzhaoliang
 * @since 2019/01/17
 */
@Service
public class HelloExtService extends HelloService {

    @Override
    public void sayHello() {
        System.out.println("Demo2: hello ext service");
    }
}
