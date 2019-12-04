package com.fis.microcloud.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.microcloud.config.InfoConfig;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年12月3日下午4:55:49 
 */
@RestController
public class ConfigClientController {
	
	@Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers; 
    
    @Resource
    private InfoConfig infoConfig;
    
    
    @RequestMapping("/config")
    public String getConfig() {
        return "ApplicationName = " + this.applicationName + "、EurekaServers = "
                + this.eurekaServers + "、infos = " +infoConfig.toString();
    }
}
