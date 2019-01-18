package com.zlqian.web;

import com.zlqian.spring.demo1.HelloExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qianzhaoliang
 * @since 2019/01/17
 */
@RequestMapping(value = "")
@Controller
public class HelloService {

    @Autowired
    private HelloExtService helloExtService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        helloExtService.sayHello();
        return "ok";
    }
}
