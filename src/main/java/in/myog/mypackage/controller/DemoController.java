package in.myog.mypackage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {
    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome to the Spring boot...";
    }
    @GetMapping("/GetDate")
    public Date getDate() {
        return new Date();
    }
}