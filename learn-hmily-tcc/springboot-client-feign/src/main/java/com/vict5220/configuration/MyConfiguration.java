package com.vict5220.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.hmily.tcc.springcloud.feign.TccFeignHandler;
import com.hmily.tcc.springcloud.feign.TccRestTemplateInterceptor;

import feign.Feign;
import feign.InvocationHandlerFactory;
import feign.Request;
import feign.Retryer;

@Configuration
public class MyConfiguration {

    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder()
                .requestInterceptor(new TccRestTemplateInterceptor())
                .invocationHandlerFactory(invocationHandlerFactory());
    }

    @Bean
    public InvocationHandlerFactory invocationHandlerFactory() {
        return (target, dispatch) -> {
            TccFeignHandler handler = new TccFeignHandler();
            handler.setTarget(target);
            handler.setHandlers(dispatch);
            return handler;
        };
    }

    @Bean
    Request.Options feignOptions() {
        return new Request.Options(5000, 5000);
    }

    @Bean
    Retryer feignRetryer() {
        return Retryer.NEVER_RETRY;
    }
}