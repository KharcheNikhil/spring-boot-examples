package com.nk.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private HelloService  helloService;

    @GetMapping("/working_retryable")
    public String sayHello() throws Exception {
        helloService.retryMethod();
        return "Hello!!";
    }

    @GetMapping("/not_working_retryable")
    public String sayHello1() throws Exception {
        helloService.notRetryMethod();
        return "Hello!!";
    }
}
