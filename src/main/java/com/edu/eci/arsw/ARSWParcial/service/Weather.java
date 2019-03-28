/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.ARSWParcial.service;

import com.edu.eci.arsw.ARSWParcial.connection.HttpConnectionExample;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2108263
 */
@Service
public class Weather implements weatherServices{
    @Autowired
    HttpConnectionExample urlSet;
    
    @Override
    public String getInfo(String city) {
        try {
            urlSet.getUrl(city);
            System.out.println("Conecta");
            return urlSet.getAnswer();
        } catch (IOException ex) {
            Logger.getLogger(Weather.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
