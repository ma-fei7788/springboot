package com.aaa.springboot.controoler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author maFeiFei
 * @date 2021/4/19 16:03
 */

@Controller
public class UserController {

    @GetMapping("hello")
    public @ResponseBody String tt(){
        return  "hello springboot666";
    }
}
