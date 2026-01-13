package com.meta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloViewController {
    private static long visitCount =0; //조회수 2 usages

    @GetMapping("static-hello")
    public String hello(){
        return "hello.html";
        //정적 파일이므로 static 폴더가 root
    }

    @GetMapping("html/redirect")
    public String htmlRedirect() {
        return "redirect:/hello.html";
    }

    @GetMapping("html/templates")
    public String htmlTemplates(){
        return "hello-template";
        //prefix로 컨텍스트 경로(templates폴더가 root)가 붙는다.
        //surfix로. html처럼 정적 페이지 확장자가 자동으로 붙는다.
    }

    @GetMapping("html/dynamic")
    public String htmlDynamic(Model model){
        visitCount++; //데이터 연산
        model.addAttribute("visits",visitCount);
    return "hello-dynamic";
    }
}


