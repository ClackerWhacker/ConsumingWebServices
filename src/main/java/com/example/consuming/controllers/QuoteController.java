package com.example.consuming.controllers;


import com.example.consuming.domainclasses.Quotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuoteController {

    @Autowired
    private RestTemplate restTemplate;

    private final String url = "https://gturnquist-quoters.cfapps.io/api/random";

    @GetMapping(path = "/getQuotes")
    public Quotes getQuotes(){

        Quotes quotes = restTemplate.getForObject(url, Quotes.class);

        return quotes;
    }

}
