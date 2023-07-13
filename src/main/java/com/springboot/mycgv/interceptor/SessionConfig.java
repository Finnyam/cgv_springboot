package com.springboot.mycgv.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SessionConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        InterceptorRegistration sessionCheckInterceptor
                = registry.addInterceptor(new SessionAuthInterceptor());
        sessionCheckInterceptor.addPathPatterns("/mypage**/**");
    }
}
