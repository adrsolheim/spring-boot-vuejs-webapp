package no.adrsolheim.webapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class SimpleRestController {

    @Value("${foo.bar}")
    private String fooBar;

    @Value("${number.ten}")
    private int numberTen;

    @GetMapping("/foobar")
    public String foobar() {
        return fooBar + " " + numberTen;
    }

    @GetMapping("/time")
    public String welcomeMessage() {
        return "Oh, look at the time.." + LocalDateTime.now();
    }

    @GetMapping("/re")
    public String testHtml() {
        return "restricted";
    }

    @GetMapping("/test")
    public String testMessage() {
        return "Test";
    }

    @GetMapping("/helloworld")
    public String helloMessage() {
        return "Hello World";
    }
}
