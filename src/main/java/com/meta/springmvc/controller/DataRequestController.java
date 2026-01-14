package com.meta.springmvc.controller;

import com.meta.springmvc.controller.entitiy.Star;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("hello/request")
public class DataRequestController {
    @GetMapping("form/html")
    public String form() {
        return "hello-request-form";
    }

    @GetMapping("/star/{name}/age/{age}")
    @ResponseBody
    public String helloRequestPath(@PathVariable String name, @PathVariable int age) {
        return String.format("Hello, @PathVariable로 받은 데이터값들, <br> name = %s, age = %d", name, age);
    }

    @GetMapping("form/param")
    @ResponseBody
    public String helloRequestParam(@RequestParam String name, @RequestParam int age) {
        return String.format("Hello, @RequestParam으로 받은 값들, <br> name = %s, age `x= %d", name, age );
    }

    @PostMapping ("form/param")
    @ResponseBody
    public String helloRequestParamPost(@RequestParam String name, @RequestParam int age) {
        return String.format("Hello, @RequestParam으로 받은 값들, <br> name = %s, age `x= %d", name, age);
    }

    @PostMapping("form/model")
    @ResponseBody
    public String helloRequestModel(Star star) {
        return String.format("hello, @ModelAtrribute(보통생략) 받은 값들, <bar> name =%s, age = %d", star.getName(), star.getAge());
    }

    @GetMapping("form/param/model")
    @ResponseBody
    public String helloRequestModelGet(Star star) {
        return String.format("hello, @ModelAtrribute(보통생략) 받은 값들, <bar> name =%s, age = %d", star.getName(), star.getAge());
    }

    @PostMapping("form/json")
    @ResponseBody
    public String helloRequestJsonPost(@RequestBody Star star) {
        return String.format("hello, @RequestBody로 받은 Json데이터를 객체로 받기, <bar> name =%s, age = %d", star.getName(), star.getAge());
    }

}
