package com.example.zuul.api.zuulapigatewaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGatewayDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZuulApiGatewayDemoApplication.class, args);

    }
    @Bean
    public AuthenticatedFilter getAuthenticatedFilter () {
        return new AuthenticatedFilter();
    }
}
