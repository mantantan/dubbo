package com.mtt.service;

import com.mtt.api.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by mantantan on 2018/1/27.
 */

public class TestServiceImpl implements TestService{
    public String sayHello(String name) {
        return "hello:" + name;
    }
}
