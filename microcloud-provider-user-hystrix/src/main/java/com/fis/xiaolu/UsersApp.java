package com.fis.xiaolu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
public class UsersApp  
{
    public static void main( String[] args )
    {
    	SpringApplication.run(UsersApp.class, args);
        System.out.println( "Hello World!" );
    }
}
