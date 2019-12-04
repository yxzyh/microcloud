package com.fis.microcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class HaConfigEurekaApp  
{
    public static void main( String[] args )
    {
    	SpringApplication.run(HaConfigEurekaApp.class, args);
        System.out.println( "Hello World!" );
    }
}
