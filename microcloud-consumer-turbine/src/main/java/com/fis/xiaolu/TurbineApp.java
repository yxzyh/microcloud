package com.fis.xiaolu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * TurbineApp
 *
 */
@SpringBootApplication
@EnableTurbine
public class TurbineApp  
{
    public static void main( String[] args )
    {
    	SpringApplication.run(TurbineApp.class, args);
        System.out.println( "Hello World!" );
    }
}
