package com.example.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.service.TestRegistryService;

@Service
public class RegistryServiceImpl implements TestRegistryService {
    @Override
    public String hello(String name){
        return "Hello"+name+"!";
    }
}
