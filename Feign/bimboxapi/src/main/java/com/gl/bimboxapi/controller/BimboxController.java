package com.gl.bimboxapi.controller;

import com.gl.bimboxapi.entity.LoginResult;
import com.gl.bimboxapi.entity.UserInfo;
import com.gl.bimboxapi.feignclient.BimBoxClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BimboxController {
    @Autowired
    BimBoxClient client;

    @GetMapping("/login")
    public LoginResult login() {
        Map<String,String> reqParms=new HashMap<>();
        reqParms.put("client_id","4WL7jl41t4jQ2YdS451wG9du");
        reqParms.put("client_secret","6oZez41tLmS3ObsEG4X1iF");
        reqParms.put("grant_type","password");
        reqParms.put("username","liyong@cabrtech.com");
        reqParms.put("password","123456");
       // reqParms.put();

        StringBuffer v=new StringBuffer();
        for (Map.Entry<String,String> entries:reqParms.entrySet()) {
            v.append(entries.getKey()).append("=").append(entries.getValue()).append("&");
        }
        LoginResult loginResult= client.login(v.substring(0,v.length()-1));
        System.setProperty("bimbox.auth.token",loginResult.getAccess_token());
        return loginResult;
    }

    @GetMapping("hello")
    public String hello(){
        return  "hello world";
    }

    @GetMapping("/user/{userid}")
    public UserInfo getUserById(@PathVariable("userid") String userid){
      return   client.getUserInfoByUserId(userid);
    }
}
