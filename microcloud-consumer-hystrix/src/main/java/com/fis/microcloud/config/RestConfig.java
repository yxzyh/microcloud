package com.fis.microcloud.config;
//package com.fis.microcloud.consumer.config;
//
//import java.nio.charset.Charset;
//import java.util.Base64;
//
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpHeaders;
//import org.springframework.web.client.RestTemplate;
//
//import com.netflix.loadbalancer.IRule;
//
///**
// * @Desc 描述。。。
// * @author XiaoLu.Su
// * @date 2019年12月2日上午10:06:31
// */
//@Configuration
//public class RestConfig {
//
//	@Bean
//	@LoadBalanced
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
//
//	@Bean
//	public HttpHeaders getHeaders() { // 要进行一个Http头信息配置
//		HttpHeaders headers = new HttpHeaders(); // 定义一个HTTP的头信息
//		String auth = "root:root"; // 认证的原始信息
//		byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII"))); // 进行一个加密的处理
//		String authHeader = "Basic " + new String(encodedAuth);
//		headers.set("Authorization", authHeader);
//		return headers;
//	}
//
////	@Bean
////	public IRule ribbonRule() { // 其中IRule就是所有规则的标准
////		return new com.netflix.loadbalancer.RandomRule(); // 随机的访问策略
////	}
//}
