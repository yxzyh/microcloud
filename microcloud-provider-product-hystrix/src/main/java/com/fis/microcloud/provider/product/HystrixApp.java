package com.fis.microcloud.provider.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableCircuitBreaker
@MapperScan("com.fis.microcloud.provider.product.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
public class HystrixApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(HystrixApp.class, args);
    }
}
