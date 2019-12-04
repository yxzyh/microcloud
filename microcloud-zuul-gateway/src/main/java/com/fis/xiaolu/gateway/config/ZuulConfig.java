package com.fis.xiaolu.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fis.xiaolu.gateway.filter.AuthorizedRequestFilter;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月3日上午11:50:55
 */
@Configuration
public class ZuulConfig {

	@Bean
	public AuthorizedRequestFilter getAuthorizedRequestFilter() {
		return new AuthorizedRequestFilter();
	}
}
