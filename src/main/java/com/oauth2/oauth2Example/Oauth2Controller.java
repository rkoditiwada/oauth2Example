package com.oauth2.oauth2Example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class Oauth2Controller {
    @GetMapping
    public  String hello(){
        return  "hello world";
    }
}
