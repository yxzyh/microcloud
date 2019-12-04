package com.fis.microcloud.service;

import com.fis.microcloud.api.vo.Product;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年12月4日上午9:48:42 
 */
public interface IMessageProvider {
	void send(Product product);
}
