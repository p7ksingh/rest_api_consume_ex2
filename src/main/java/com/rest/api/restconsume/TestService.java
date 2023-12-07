package com.rest.api.restconsume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    public Tourist getApiData() {
        return restTemplate.getForObject("http://restapi.adequateshop.com/api/Tourist/286964", Tourist.class);

    }

}
