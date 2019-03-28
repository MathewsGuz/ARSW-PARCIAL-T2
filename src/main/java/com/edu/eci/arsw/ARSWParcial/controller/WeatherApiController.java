/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.ARSWParcial.controller;

import com.edu.eci.arsw.ARSWParcial.service.Weather;
import com.edu.eci.arsw.ARSWParcial.service.weatherServices;
import static java.lang.System.console;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2108263
 */
@RestController
@RequestMapping(value = "/weather")
@Service
public class WeatherApiController {
    
    @Autowired
    weatherServices wt;
    
    @CrossOrigin(origins="*")
    @GetMapping("/{city}")
    public ResponseEntity<?> GetCity(@PathVariable String city){
        System.out.print("hollla mundooooo");
        try {
            System.out.print("hollla mundooooo");
            return new ResponseEntity<>(wt.getInfo(city),HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(WeatherApiController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("",HttpStatus.NOT_FOUND);
        }      
    }
}
