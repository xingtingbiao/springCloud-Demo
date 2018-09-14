package com.example.serviceribbonhystrix.controller;

import com.example.serviceribbonhystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired private HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name") String name) {
        return helloService.hiService(name);
    }
}
