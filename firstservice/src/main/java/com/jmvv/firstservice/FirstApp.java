package com.jmvv.firstservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/first")
public class FirstApp 
{
    @GetMapping("/run")
    public String hola(){
        return "first Service On!!!";
    }
    public static void main( String[] args )
    {
        SpringApplication.run(FirstApp.class, args);
        System.out.println( "Hello World!" );
    }
}
