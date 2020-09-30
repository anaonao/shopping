package com.tjetc.service;

import com.tjetc.dao.OrderItemDao;
import com.tjetc.domain.OrderItem;
import com.tjetc.util.Page;

public interface OrderItemService {
    /**
     * 添加订单商品信息
     * @param orderItem
     * @return
     */
    int add(OrderItem orderItem);

    /**
     * 删除订单商品信息
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 改订单商品信息
     * @param orderItem
     * @return
     */
    int update(OrderItem orderItem);

    /**
     * 查询所有订单商品信息
     * @return
     */
    Page<OrderItemDao> findAll();
    int countAll();
}
