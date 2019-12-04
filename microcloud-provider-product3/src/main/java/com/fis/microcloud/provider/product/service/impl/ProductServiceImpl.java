package com.fis.microcloud.provider.product.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fis.microcloud.api.vo.Product;
import com.fis.microcloud.provider.product.mapper.ProductMapper;
import com.fis.microcloud.provider.product.service.IProductService;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月2日上午9:01:03
 */
@Service
public class ProductServiceImpl  implements IProductService{
	@Resource
	private ProductMapper productMapper;

	@Override
	public Product get(long id) {
		return productMapper.findById(id);
	}

	@Override
	public boolean add(Product product) {
		return productMapper.create(product);
	}

	@Override
	public List<Product> list() {
		return productMapper.findAll();
	}
}
