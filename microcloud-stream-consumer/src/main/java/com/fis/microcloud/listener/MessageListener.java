package com.fis.microcloud.listener;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.fis.microcloud.api.channel.DefaultProcess;
import com.fis.microcloud.api.vo.Product;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月4日上午10:03:49
 */
@Component
@EnableBinding(DefaultProcess.class)
public class MessageListener {
	@StreamListener(DefaultProcess.INPUT)
	public void input(Message<Product> message) {
		System.err.println("【*** 消息接收 ***】" + message.getPayload());
	}
}
