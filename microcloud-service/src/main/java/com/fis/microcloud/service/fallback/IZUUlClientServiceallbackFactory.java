package com.fis.microcloud.service.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fis.microcloud.api.vo.Product;
import com.fis.microcloud.api.vo.Users;
import com.fis.microcloud.service.IZUUlClientService;

import feign.hystrix.FallbackFactory;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月3日下午1:53:45
 */
@Component
public class IZUUlClientServiceallbackFactory implements FallbackFactory<IZUUlClientService> {

	@Override
	public IZUUlClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new IZUUlClientService() {

			@Override
			public Product getProduct(long id) {
				Product product = new Product();
				product.setProductId(999999L);
				product.setProductName("feign-zuulName");
				product.setProductDesc("feign-zuulDesc");
				return product;
			}

			@Override
			public List<Product> listProduct() {
				return null;
			}

			@Override
			public boolean addPorduct(Product product) {
				return false;
			}

			@Override
			public Users getUsers(String name) {
				Users user = new Users();
				user.setSex("F");
				user.setAge(17);
				user.setName("zuul-fllback：" + name);
				return user;
			}

		};
	}

}
