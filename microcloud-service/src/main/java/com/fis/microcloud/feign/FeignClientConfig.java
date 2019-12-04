package com.fis.microcloud.feign;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年12月2日下午4:58:16 
 */
@Configuration
public class FeignClientConfig {
	@Bean
	public Logger.Level getFeignLoggerLevel() {
		return feign.Logger.Level.FULL;
	}

	@Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "fis");
    }
	
	
}
