## 1.开启Feign日志
开启日志，方便查看调用过程，可以输出一些调用参数之类的。便于调试差错。
>开启Feign的日志功能后，每创建一个Feign客户端同时也会创建一个日志记录器（logger），它的名字默认就是Feign接口的全量命名，并且这个日志logger只能响应DEBUG级的日志
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
添加上述配置还是算完，官网文档中说日志输出级别默认是NONE的，我们还需配置下
- NONE：不记录任何信息
- BASIC：仅记录请求方法和URL，以及状态码和执行时间
- HEADERS：在BASIC基础上同时记录请求和响应的头信息
- FULL：记录所有请求与响应的明细
我们可以改变日志输出等级来完成日志输出，官网给出的例子是FULL
### 2.在配置文件中配置输出
application.yml中填加以logging.level为前缀，后边加上Feign接口的路径全量命名

```
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
## 2.请求压缩(Feign request/response compression)
Spring Cloud Feign支持对请求与响应进行GZIP压缩来减少通信过程中带宽的消耗

只需加入两行配置即可开启请求压缩
```
feign.compression.request.enabled=true
feign.compression.response.enabled=true
```
还有一些更细致的配置
```
feign.compression.request.enabled=true
feign.compression.request.mime-types=text/xml,application/xml,application/json
feign.compression.request.min-request-size=2048
```
