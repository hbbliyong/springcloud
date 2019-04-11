package com.gl.bimboxapi.feignclient;

import com.gl.bimboxapi.config.FeignConfiguration;
import com.gl.bimboxapi.entity.LoginResult;
import com.gl.bimboxapi.entity.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.websocket.server.PathParam;

@FeignClient(value = "local",configuration = FeignConfiguration.class,url = "https://api.cloud.aecworks.cn")
public interface BimBoxClient {
    @RequestMapping(value = "/api/values/11", method = RequestMethod.GET)
    String getValue();

    @RequestMapping(value = "/api/values", method = RequestMethod.GET)
    String[] getArrayValue();

    /**
     * 登录
     */
    @RequestMapping(value="/bimserver/auth/oauth/token",method = RequestMethod.POST,consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    LoginResult login(String entityBody);

    @RequestMapping(value="/bimserver/user/v3/users/{userId}")
    UserInfo getUserInfoByUserId(@PathVariable("userId") String userId);
}

