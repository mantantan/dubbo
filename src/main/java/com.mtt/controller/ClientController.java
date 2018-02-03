package com.mtt.controller;

import com.mtt.api.TestService;
import com.mtt.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by mantantan on 2018/1/27.
 */
@RestController
@RequestMapping
public class ClientController {

    /**
     * 调用端
     */
    @Resource(name = "testConsumerService")
    private TestService testConsumerService;

    @RequestMapping(value = "/test")
    public String testSay(@RequestParam(value = "name",defaultValue = "") String name){
        StringBuffer sb = new StringBuffer();
        sb.append("Dubbo: ").append(testConsumerService.sayHello(name));
        return sb.toString();
    }

}
