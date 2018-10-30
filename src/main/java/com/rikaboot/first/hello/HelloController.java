package com.rikaboot.first.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//ResController可以把返回值直接返回，不需要检验视图，如果改成普通的controller会报错因为找不到视图

@RestController
public class  HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloSpringBoot(){
        return "hello,spring boot";
    }
}


