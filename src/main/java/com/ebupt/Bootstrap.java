package com.ebupt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication(scanBasePackages = {"com.ebupt"})
@EnableTransactionManagement(proxyTargetClass = true)
@EnableAsync
@EnableScheduling
public class Bootstrap implements WebMvcConfigurer {

    private HandlerInterceptor[] interceptors;

    private HandlerMethodArgumentResolver[] argumentResolvers;

    @Autowired
    public void setInterceptors(HandlerInterceptor[] interceptors) {
        this.interceptors = interceptors;
    }

    @Autowired
    public void setArgumentResolvers(HandlerMethodArgumentResolver[] argumentResolvers) {
        this.argumentResolvers = argumentResolvers;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        Stream.of(interceptors).forEach(registry::addInterceptor);
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.addAll(Arrays.asList(this.argumentResolvers));
    }



    public static void main(String... args) {
        SpringApplication.run(Bootstrap.class, args);
    }

}
