package com.fis.microcloud.provider.product.controller;

import javax.annotation.Resource;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.microcloud.api.vo.Product;
import com.fis.microcloud.provider.product.service.IProductService;

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
	public Object get(@PathVariable("id") long id) {
		return this.iProductService.get(id);
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
