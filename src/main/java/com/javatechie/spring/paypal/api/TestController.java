package com.javatechie.spring.paypal.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test()
    {
        return "hello Subhankar";
    }
}
