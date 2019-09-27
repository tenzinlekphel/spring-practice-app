package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Primary
@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!");
        return greetingService.sayGreeting();
    }
}
