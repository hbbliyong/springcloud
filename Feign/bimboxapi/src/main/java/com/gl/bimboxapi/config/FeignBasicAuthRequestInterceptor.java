package com.gl.bimboxapi.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * Feign请求拦截器
 */
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
//        requestTemplate.header("Authorization","Bearer "+System.getProperty("bimbox.auth.token"));
        requestTemplate.header("Authorization","Bearer "+System.getProperty("bimbox.auth.token"));
    }
}
