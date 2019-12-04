package com.fis.xiaolu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月2日下午4:34:12
 */
@Configuration
public class RibbonConfig {
	@Bean
	public IRule ribbonRule() { // 其中IRule就是所有规则的标准
		return new com.netflix.loadbalancer.RandomRule(); // 随机的访问策略
	}
}
