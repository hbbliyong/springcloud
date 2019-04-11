package com.gl.bimboxapi.controller;

import com.gl.bimboxapi.feignclient.BimBoxClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLocal {

    @Autowired
    BimBoxClient bimBoxClient;
    @GetMapping("/")
    public String Get(){
        String data=bimBoxClient.getValue();
        return data;
    }
    @GetMapping("/test")
    public  String[] getArray(){
        return bimBoxClient.getArrayValue();
    }
}
