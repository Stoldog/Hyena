package cn.stoldog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RL on 2017/8/6.
 */
@RestController
@RequestMapping("/hyena/core")
public class LoginController {

    @RequestMapping("sayHello")
    public String sayHello(){
        return "Hi~ I`m Hyena.";
    }
}
