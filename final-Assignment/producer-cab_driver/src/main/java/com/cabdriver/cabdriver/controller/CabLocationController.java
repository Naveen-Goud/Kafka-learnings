package com.cabdriver.cabdriver.controller;

import com.cabdriver.cabdriver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {
    @Autowired
    private CabLocationService cabLocationService;

    @PostMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        int range = 10;
        while (range > 0) {
            cabLocationService.updateLocation(Math.random() + " , " + Math.random());
            Thread.sleep(100);
            range --;
        }
        return new ResponseEntity<>(Map.of("message", "Location Updated")
                , HttpStatus.OK);
    }
}
