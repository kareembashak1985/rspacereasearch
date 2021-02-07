package com.rspace.RSpaceLaboratory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;


@org.springframework.context.annotation.Configuration
@Import({AppConfigProperties.class})
public class Configuration {
	
		
	@Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        //TODO add interceptor at later stage.
        return restTemplate;
    }

}

