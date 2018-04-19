package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class DemoController {


    @GetMapping("/save")
    public String test(@RequestParam String name, HttpSession session) {
        session.setAttribute("name", name);
        return "template";
    }

    @GetMapping("/")
    public String getName() {
        return "template";
    }
}
