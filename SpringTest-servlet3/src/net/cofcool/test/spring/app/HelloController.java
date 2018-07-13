package net.cofcool.test.spring.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CofCool
 * @date 2018/7/13
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
