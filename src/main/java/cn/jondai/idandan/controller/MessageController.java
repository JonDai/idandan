package cn.jondai.idandan.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/10.
 */
@RestController
public class MessageController {

    @RequestMapping(value = "/msgs")
    public String initMsg(){
        return "this is msgssssssssssssssss";
    }

    @RequestMapping(value = "/1")
    String msg() {
        return "this is msg 11111111111";
    }

    @RequestMapping(value = "/")
    String home() {
        return "Hello World!";
    }
}
