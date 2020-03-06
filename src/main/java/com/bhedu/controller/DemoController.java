package com.bhedu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("sayGit")
    private String sayGit() {
        return "Hello Git";
    }
}
