package com.fis.microcloud.provider.product.controller;

import javax.annotation.Resource;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.microcloud.api.vo.Product;
import com.fis.microcloud.provider.product.service.IProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月2日上午9:35:31
 */
@RestController
@RequestMapping("/prodcut")
public class ProductController {
	@Resource
	private IProductService iProductService;

	@Resource
	private DiscoveryClient client; // 进行Eureka的发现服务

	@RequestMapping(value = "/get/{id}")
	@HystrixCommand(fallbackMethod = "getFallback")
	public Object get(@PathVariable("id") long id) {
		Product product = this.iProductService.get(id);
		if (product == null) {
			throw new RuntimeException("该产品已下架！");
		}
		return product;
	}

	public Object getFallback(@PathVariable("id") long id) {
		Product product = new Product();
		product.setProductName("HystrixName");
		product.setProductDesc("HystrixDesc");
		product.setProductId(0L);
		return product;
	}

	@RequestMapping(value = "/add")
	public Object add(@RequestBody Product product) {
		return this.iProductService.add(product);
	}

	@RequestMapping(value = "/list")
	public Object list() {
		return this.iProductService.list();
	}

	@RequestMapping("/discover")
	public Object discover() { // 直接返回发现服务信息
		return this.client;
	}
}
