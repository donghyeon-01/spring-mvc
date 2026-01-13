package com.meta.springmvc.controller;

import com.meta.springmvc.controller.entitiy.Star;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/response/jason")
public class DataResponseController {
    @GetMapping("string")
    public String helloStringJson() {
        return "{\"name\" : \"Meta\", \"age\" : 25}";
    }

    @GetMapping("class")
    public Star helloClassJson() {
        return new Star("Meta", 30);
    }
}
