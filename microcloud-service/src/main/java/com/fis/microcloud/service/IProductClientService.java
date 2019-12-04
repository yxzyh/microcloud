package com.fis.microcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fis.microcloud.api.vo.Product;
import com.fis.microcloud.feign.FeignClientConfig;
import com.fis.microcloud.service.fallback.IProductClientServiceFallbackFactory;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月2日下午4:59:03
 */
@FeignClient(name = "MICROCLOUD-PROVIDER-PRODUCT", configuration = FeignClientConfig.class, fallbackFactory = IProductClientServiceFallbackFactory.class)
public interface IProductClientService {
	@RequestMapping("/prodcut/get/{id}")
	public Product getProduct(@PathVariable("id") long id);

	@RequestMapping("/prodcut/list")
	public List<Product> listProduct();

	@RequestMapping("/prodcut/add")
	public boolean addPorduct(Product product);
}
