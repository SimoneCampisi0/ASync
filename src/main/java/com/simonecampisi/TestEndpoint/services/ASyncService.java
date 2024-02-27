package com.simonecampisi.TestEndpoint.services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ASyncService implements GenericASyncService{
    @Override
    @Async
    public void asyncMessage() {
        try {
            //Simula il ritardo nella risposta.
            Thread.sleep(2400);
            System.out.println("OKAY from async service");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
