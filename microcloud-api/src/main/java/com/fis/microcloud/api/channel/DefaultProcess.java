package com.fis.microcloud.api.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年12月4日上午10:11:12 
 */
public interface DefaultProcess {
    public static final String OUTPUT = "fis_output"; // 输出通道名称
    public static final String INPUT = "fis_input"; // 输入通道名称
    @Input(DefaultProcess.INPUT)
    public SubscribableChannel input();
    @Output(DefaultProcess.OUTPUT)
    public MessageChannel output();
}
