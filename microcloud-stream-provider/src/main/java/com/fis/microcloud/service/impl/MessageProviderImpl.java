package com.fis.microcloud.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import com.fis.microcloud.api.channel.DefaultProcess;
import com.fis.microcloud.api.vo.Product;
import com.fis.microcloud.service.IMessageProvider;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月4日上午9:49:51
 */
@EnableBinding(DefaultProcess.class)
public class MessageProviderImpl implements IMessageProvider {
	@Resource
	@Qualifier("fis_output")
	private MessageChannel output; // 消息的发送管道

	@Override
	public void send(Product product) {
		 output.send(MessageBuilder.withPayload(product).build());
	}

}
