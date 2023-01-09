package com.msg.sc.scaccess.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ScAccessConfiguration {
    @Bean
    public RestTemplate odataRestTemplate() {
        return new RestTemplateBuilder()
                .rootUri("https://1270.callidusondemand.com/api/v2")
                .basicAuthentication("FSA_ADMIN", "=Ym)TLx%5WzYwkS!")
                .build();
    }

}
