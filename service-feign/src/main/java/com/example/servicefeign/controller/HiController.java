package com.example.servicefeign.controller;

import com.example.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
