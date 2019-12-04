package com.fis.microcloud.provider.product.mapper;

import java.util.List;

import com.fis.microcloud.api.vo.Product;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日下午6:46:26
 */
public interface ProductMapper {
	
	boolean create(Product product);
	public Product findById(Long id);
	public List<Product> findAll();
	
}
