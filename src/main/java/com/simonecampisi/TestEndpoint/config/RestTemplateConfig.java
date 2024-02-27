package com.simonecampisi.TestEndpoint.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    /* Ritorna un'istanza RestTemplate che viene utilizzata in ASyncService */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
