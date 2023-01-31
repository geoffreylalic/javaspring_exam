package com.example.my_finder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

public class FilmeController {

    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    public String getActeurs() {
        String url = "http://localhost:3002/acteurs/";
        // Define the URL to make the request to

        // Create an HttpEntity object with the request headers
        ResponseEntity<String> response;
        response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        return response.getBody();
    }
}
