package com.tjetc.domain;

import java.util.Date;

public class Order {
    private String orderid;//生成唯一
    private Cart cart; //购物车信息
    private Date orderDate;//下单时间
    private Double order_price;//总价格

    public Order() {
    }

    public Order(String orderid, Cart cart, Date orderDate, Double order_price) {
        this.orderid = orderid;
        this.cart = cart;
        this.orderDate = orderDate;
        this.order_price = order_price;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(Double order_price) {
        this.order_price = order_price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid='" + orderid + '\'' +
                ", cart=" + cart +
                ", orderDate=" + orderDate +
                ", order_price=" + order_price +
                '}';
    }
}
