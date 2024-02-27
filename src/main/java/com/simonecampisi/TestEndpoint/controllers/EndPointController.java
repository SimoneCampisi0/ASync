package com.simonecampisi.TestEndpoint.controllers;

import com.simonecampisi.TestEndpoint.services.ASyncService;
import com.simonecampisi.TestEndpoint.services.GenericASyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EndPointController {
    @Autowired
    private GenericASyncService service;

    @GetMapping
    public ResponseEntity<?> getMessage() {
        try {
            service.asyncMessage();
            return ResponseEntity.status(HttpStatus.OK).body("SUCCESS");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        }
    }

}
