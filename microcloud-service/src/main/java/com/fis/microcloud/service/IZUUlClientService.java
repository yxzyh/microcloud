package com.fis.microcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fis.microcloud.api.vo.Product;
import com.fis.microcloud.api.vo.Users;
import com.fis.microcloud.feign.FeignClientConfig;
import com.fis.microcloud.service.fallback.IZUUlClientServiceallbackFactory;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月3日下午1:53:03
 */
@FeignClient(name = "MICROCLOUD-ZUUL-GATEWAY", configuration = FeignClientConfig.class, fallbackFactory = IZUUlClientServiceallbackFactory.class)
public interface IZUUlClientService {
	@RequestMapping("/fis-api/product-proxy/prodcut/get/{id}")
	public Product getProduct(@PathVariable("id") long id);

	@RequestMapping("/fis-api/product-proxy/prodcut/list")
	public List<Product> listProduct();

	@RequestMapping("/fis-api/product-proxy/prodcut/add")
	public boolean addPorduct(Product product);

	@RequestMapping("/fis-api/users-proxy/users/get/{name}")
	public Users getUsers(@PathVariable("name") String name);
}
