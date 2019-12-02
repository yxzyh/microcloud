package com.fis.microcloud.consumer.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fis.microcloud.api.vo.Product;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月2日上午10:09:29
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {
	public static final String PRODUCT_GET_URL = "http://localhost:8080/prodcut/get/";
	public static final String PRODUCT_LIST_URL = "http://localhost:8080/prodcut/list/";
	public static final String PRODUCT_ADD_URL = "http://localhost:8080/prodcut/add/";

	@Resource
	private RestTemplate restTemplate;

	@Resource
	private HttpHeaders httpHeaders;

	@RequestMapping("/product/get")
	public Object getProduct(long id) {
		Product product = restTemplate
				.exchange(PRODUCT_GET_URL + id, HttpMethod.GET, new HttpEntity<Object>(httpHeaders), Product.class)
				.getBody();
		return product;
	}

	@RequestMapping("/product/list")
	public Object listProduct() {
		List<Product> list = restTemplate
				.exchange(PRODUCT_LIST_URL, HttpMethod.GET, new HttpEntity<Object>(httpHeaders), List.class).getBody();
		return list;
	}

//	@RequestMapping("/product/add")
//	public Object addPorduct(Product product) {
//		Boolean result = restTemplate
//				.exchange(PRODUCT_ADD_URL, HttpMethod.POST, new HttpEntity<Object>(product, httpHeaders), Boolean.class)
//				.getBody();
//		return result;
//	}
	
    @RequestMapping("/product/add")
    public Object addProduct(Product product) {
        Boolean result = restTemplate.exchange(PRODUCT_ADD_URL, HttpMethod.POST,new HttpEntity<Object>(product,httpHeaders), Boolean.class).getBody();
        return  result;
    }

}
