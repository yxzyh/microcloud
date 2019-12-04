package com.fis.microcloud.provider.product.service;

import java.util.List;

import com.fis.microcloud.api.vo.Product;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月2日上午9:00:07
 */
public interface IProductService {
	Product get(long id);
	boolean add(Product product);
	List<Product> list();
}
