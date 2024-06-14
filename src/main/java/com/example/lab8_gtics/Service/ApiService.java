package com.example.lab8_gtics.Service;

import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;

public class ApiService {
    private final RestTemplate restTemplate;

    public ApiService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public String callApiWithBearerTokenandParam(String baseUrl, String paramName, String paramValue, String token){
        HttpHeaders headers= new org.springframework.http.HttpHeaders();
        headers.set("Authorization", "Bearer"+token );

        String url=UrlComponentsBuilder.fromHttpUrl(baseUrl).query
    }
}
