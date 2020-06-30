package com.example.controller.start.Test;

import com.example.service.TestRegistryService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Controller
public class TestController {
    @Resource
    private TestRegistryService testRegistryService;

    @RequestMapping(value="/hello/{name}")
    @ResponseBody
    public String test(@PathVariable("name") String name){
        System.out.println(name);
        return testRegistryService.hello(name);
    }
}
