package cn.gis.lab.swaggerlearning.controller;

import cn.gis.lab.swaggerlearning.annotation.SwaggerInterface;
import cn.gis.lab.swaggerlearning.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@SwaggerInterface
@RestController
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String getHello() {
        System.out.println("Hello");

        return "Hello";
    }

    @PostMapping(value = "/user")
    public User getUser(String userName, String password) {
        return new User();
    }

    @ApiOperation("返回传入的一个参数")
    @PostMapping(value = "/param")
    public String returnParam(@ApiParam("参数") @RequestParam("param") String param) {
        return param;
    }

    @ApiOperation("返回传入的表单")
    @PostMapping(value = "/form")
    public String returnForm(@ApiParam("表单") @RequestParam("form") String form, @ApiParam("请求") HttpRequest request) {
        return form;
    }

    @ApiOperation("返回传入的请求")
    @PostMapping(value = "/request")
    public HttpServletRequest returnRequest(HttpServletRequest request) {
        return request;
    }

}
