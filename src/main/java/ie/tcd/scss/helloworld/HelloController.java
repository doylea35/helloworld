package ie.tcd.scss.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!!!";
    }

    @GetMapping("/howareyou")
    public String howareyou() {
        return "Grand. How are you?";
    }
}
