package com.fis.microcloud.provider.product;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fis.microcloud.api.vo.Product;
import com.fis.microcloud.provider.product.service.IProductService;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月2日上午9:04:08
 */
@SpringBootTest(classes = ProductApp.class)
@RunWith(SpringRunner.class)
public class ProductServiceTest {
	@Resource
	private IProductService iProductService;

	@Test
	public void testGet() {
		System.out.println(iProductService.get(1));
	}

	@Test
	public void testAdd() {
		Product dept = new Product();
		dept.setProductName("lison-" + System.currentTimeMillis());
		System.out.println(iProductService.add(dept));
	}

	@Test
	public void testList() {
		System.out.println(iProductService.list());
	}
}
