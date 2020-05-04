package com.xch900910.mall.web.controller;

import com.xch900910.mall.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xch900910
 * @version 1.0
 * @Desc
 * @Date 2020/5/3 17:33
 **/
@RestController
@RequestMapping("/mall")
public class MallController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/test")
    public String test() {
        return orderService.test();
    }
}
