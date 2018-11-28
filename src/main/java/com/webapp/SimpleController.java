package com.webapp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping(name="index", path="/")
    public String index() {
        return "Hello world simple response";
    }
}
