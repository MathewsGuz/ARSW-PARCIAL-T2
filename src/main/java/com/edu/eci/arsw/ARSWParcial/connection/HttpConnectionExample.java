/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.ARSWParcial.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author 2108263
 */
@Service
public class HttpConnectionExample{
    
    
    
    public  String url;
    public  String answer;
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "api.openweathermap.org/data/2.5/weather?q&apikey=Q1QZFVJQ21K7C6XM";//chane for appikey

    public void getUrl(String city) throws IOException {
        url ="api.openweathermap.org/data/2.5/weather?q="+city+"&appid=8991e94bc9dfeb5d2f144f19fe653487";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
            answer= response.toString();
        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
        
    }

    
    public String getAnswer() throws IOException {
        return answer;
    }

    
}
