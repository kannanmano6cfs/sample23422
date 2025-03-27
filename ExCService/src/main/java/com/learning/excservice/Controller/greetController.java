package com.learning.excservice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetController {

    @GetMapping("/greet")
    public String greet() {
        return "Greetings to All!! Azure Public Cloud exploring...";
    }

    @GetMapping("/")
    public String getindex() {
        return "Hello All!! I am running from Azure Web App Services";
    }
}
