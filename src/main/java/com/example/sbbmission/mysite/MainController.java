package com.example.sbbmission.mysite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    // @ResponseBody 애너테이션은 URL 요청에 대한 응답으로 문자열을 리턴하라는 의미
    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕하세요";
    }
}

