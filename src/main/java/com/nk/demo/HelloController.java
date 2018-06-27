package com.nk.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService  helloService;

    @GetMapping
    public String sayHello() throws Exception {
        helloService.retryMethod();
        return "Hello!!";
    }
}
