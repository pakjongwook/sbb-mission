package com.example.sbbmission.mysite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    // sbb 하위 폴더만 스캔됨.
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello SB";
    }
}
