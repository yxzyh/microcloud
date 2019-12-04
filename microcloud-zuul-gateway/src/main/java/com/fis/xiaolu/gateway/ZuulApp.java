package com.fis.xiaolu.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ZuulApp.class, args);
        System.out.println( "Hello World!" );
    }
}
