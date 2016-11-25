package com.example.acc.com.example.acc.demo.webcontentwithmvc;

import com.example.acc.com.example.acc.demo.restservice.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Controller
//@RestController
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello, %s!";

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
        //return new Greeting(counter.incrementAndGet(),
        //        String.format(template, name));
    }

}
