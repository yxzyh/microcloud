package com.fis.microcloud.service.fallback;

import java.util.List;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.fis.microcloud.api.vo.Product;
import com.fis.microcloud.service.IProductClientService;

import feign.hystrix.FallbackFactory;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月3日上午9:09:02
 */
@Component
public class IProductClientServiceFallbackFactory implements FallbackFactory<IProductClientService> {

	@Override
	public IProductClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new IProductClientService() {

			@Override
			public Product getProduct(long id) {
				Product product = new Product();
				product.setProductId(999999L);
				product.setProductName("feign-hystrixName");
				product.setProductDesc("feign-hystrixDesc");
				return product;
			}

			@Override
			public List<Product> listProduct() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean addPorduct(Product product) {
				// TODO Auto-generated method stub
				return false;
			}

		};

	}

}
