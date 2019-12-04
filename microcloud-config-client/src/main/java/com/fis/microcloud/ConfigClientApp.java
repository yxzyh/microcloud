package com.fis.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ConfigClientApp 
 *
 */
@SpringBootApplication
public class ConfigClientApp  
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ConfigClientApp.class, args);
        System.out.println( "Hello World!" );
    }
}
