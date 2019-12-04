package com.fis.microcloud.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fis.microcloud.StreamProviderApp;
import com.fis.microcloud.api.vo.Product;
import com.fis.microcloud.service.IMessageProvider;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月4日上午9:53:24
 */
@SpringBootTest(classes = StreamProviderApp.class)
@RunWith(SpringRunner.class)
public class TestMessageProvider {
	@Resource
	private IMessageProvider messageProvider;

	@Test
	public void testSend() {
		Product product = new Product();
		product.setProductId(1L);
		product.setProductName("messageName");
		product.setProductDesc("desc");
		messageProvider.send(product);
	}
}
