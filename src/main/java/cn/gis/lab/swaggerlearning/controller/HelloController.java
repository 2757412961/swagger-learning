package cn.gis.lab.swaggerlearning.controller;

import cn.gis.lab.swaggerlearning.annotation.SwaggerInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SwaggerInterface
@RestController
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String getHello() {
        System.out.println("Hello");

        return "Hello";
    }

}
