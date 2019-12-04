package com.fis.xiaolu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.microcloud.api.vo.Users;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月3日上午10:13:31
 */
@RestController
@RequestMapping("/users")
public class UserController {
	@RequestMapping("/get/{name}")
	@HystrixCommand
	public Object get(@PathVariable("name") String name) {
		Users users = new Users();
		users.setName(name);
		users.setAge(18);
		users.setSex("F");
		return users;
	}
}
