package com.simonecampisi.TestEndpoint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ASyncService implements GenericASyncService {

    @Autowired
    private RestTemplate restTemplate;

    public void getEndpointB() {
        String URL = "http://localhost:8081/";
        ResponseEntity<String> response = restTemplate.getForEntity(URL, String.class);
        System.out.println(response.getBody());
    }

    @Override
    @Async
    public void asyncMessage() {
        try {
            //Simula il ritardo nella risposta.
            Thread.sleep(2400);
            getEndpointB();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
