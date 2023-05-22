package com.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @RequestMapping("/w")
    public String word() {
        return "word666";
    }
}
