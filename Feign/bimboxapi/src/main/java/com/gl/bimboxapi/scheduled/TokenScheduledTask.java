package com.gl.bimboxapi.scheduled;

import com.gl.bimboxapi.entity.LoginResult;
import com.gl.bimboxapi.feignclient.BimBoxClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



import java.util.HashMap;
import java.util.Map;


/**
 * 定时刷新token
 * @author Administrator
 */
@Component
public class TokenScheduledTask {
    private  final  static Logger logger= LoggerFactory.getLogger(TokenScheduledTask.class);
    public final static long ONE_Minute = 60 * 1000 * 60 * 20;

    @Autowired
    private BimBoxClient client;

    @Scheduled(fixedDelay = ONE_Minute)
    public  void reloadApiToken(){
        String token=getToken();
//        while (StringUtils.(token)){
//
//        }
        System.setProperty("bimbox.auth.token",token);
    }
    public String getToken(){
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

        return loginResult.getAccess_token();
    }
}
