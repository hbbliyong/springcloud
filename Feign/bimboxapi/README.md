## 1.开启Feign日志
开启日志，方便查看调用过程，可以输出一些调用参数之类的。便于调试差错。
### 1.在配置里面开启日志级别
```
package com.gl.bimboxapi.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class FeignConfiguration {
    /**
     * 日志级别
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

    /**
     * 创建Feign请求拦截器，在发送请求前设置认证的token,各个微服务将token设置到环境变量中来达到通用
     * @return
     */
    @Bean
    public FeignBasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return  new FeignBasicAuthRequestInterceptor();
    }
}
```
### 2.在配置文件中配置输出
```
application.yml
spring:
  application:
    name: bimbox

logging:
  level:
    com:
      gl:
        bimboxapi:
          feignclient:
            BimBoxClient:
              DEBUG
```
### 3.在Client上面指定配置
```
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
```
