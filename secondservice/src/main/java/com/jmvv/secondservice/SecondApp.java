package com.jmvv.secondservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@RequestMapping("/second")
public class SecondApp 
{
    @GetMapping("/run")
    public String secondApp() {
        return "Second Micro Service On!!";
    }
    public static void main( String[] args )
    {
        SpringApplication.run(SecondApp.class, args);
    }
}
