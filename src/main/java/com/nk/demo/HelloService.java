package com.nk.demo;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class HelloService {


    @Retryable(value = Exception.class)
    public void retryMethod() throws Exception {
        System.out.println("HelloController.retryMethod");
        throw new Exception();
    }

    @Recover
    public void recover(Exception exception) {
        System.out.println("HelloController.recover");
    }
}
