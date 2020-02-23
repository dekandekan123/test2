package com.example.demo.controller;

import com.example.demo.beans.Welcome;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
    private static final String welcomemsg ="Welcome Mr. / Ms. %s!";

    @GetMapping("/welcome/user")
    @ResponseBody
    public Welcome welcomeUser(@RequestParam(name = "name" , required = false, defaultValue = "java fan") String name){
        return new Welcome(String.format(welcomemsg, name));
    }
}
