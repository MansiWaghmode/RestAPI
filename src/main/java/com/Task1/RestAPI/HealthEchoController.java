package com.Task1.RestAPI;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthEchoController {

    @GetMapping("/health")
    public Map<String,String> health(){
        Map<String,String> response = new HashMap<>();
        response.put("status","UP");
        return response;
    } 

    @PostMapping("/echo")
    public Map<String,Object> echo(@RequestBody Map<String,Object> request) {
       return request;
    }
    
}
