package com.example.demosaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class DemosamlApplication {

    @GetMapping("/")
    public String createUser(Principal principal){
        
        return "hi"+principal.getName()+"from application 1";


    }
    public static void main(String[] args) {

        SpringApplication.run(DemosamlApplication.class, args);
    }

}
