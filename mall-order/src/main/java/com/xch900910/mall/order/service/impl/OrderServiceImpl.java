package com.xch900910.mall.order.service.impl;

import com.xch900910.mall.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author xch900910
 * @version 1.0
 * @Desc
 * @Date 2020/5/3 17:45
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String test() {
        return "order test";
    }
}
