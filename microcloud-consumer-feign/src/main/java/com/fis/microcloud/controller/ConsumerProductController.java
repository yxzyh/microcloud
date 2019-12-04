package com.fis.microcloud.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.microcloud.api.vo.Product;
import com.fis.microcloud.service.IProductClientService;
import com.fis.microcloud.service.IZUUlClientService;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年12月2日上午10:09:29
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {
    @Resource
    private IProductClientService iProductClientService;
    
    @Resource
    private IZUUlClientService izuUlClientService;

    @RequestMapping("/product/get")
    public Object getProduct(long id) {
        return  iProductClientService.getProduct(id);
    }

    @RequestMapping("/product/list")
    public  Object listProduct() {
        return iProductClientService.listProduct();
    }

    @RequestMapping("/product/add")
    public Object addPorduct(Product product) {
        return  iProductClientService.addPorduct(product);
    }

    @RequestMapping("/product/getProductAndUser")
    public Object getProductAndUser(long id) {
        Map<String,Object> result = new HashMap();
        result.put("product",izuUlClientService.getProduct(id));
        result.put("user",izuUlClientService.getUsers(id+""));
        return  result;
    }
}
