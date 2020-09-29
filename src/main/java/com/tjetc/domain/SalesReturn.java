package com.tjetc.domain;

import java.util.Date;

public class SalesReturn {
    private String  return_id;
    private Date return_date;
    private Double order_price;
    private Cart cart;

    public SalesReturn() {
    }

    public SalesReturn(String return_id, Date return_date, Double order_price, Cart cart) {
        this.return_id = return_id;
        this.return_date = return_date;
        this.order_price = order_price;
        this.cart = cart;
    }

    public String getReturn_id() {
        return return_id;
    }

    public void setReturn_id(String return_id) {
        this.return_id = return_id;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }

    public Double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(Double order_price) {
        this.order_price = order_price;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "SalesReturn{" +
                "return_id='" + return_id + '\'' +
                ", return_date=" + return_date +
                ", order_price=" + order_price +
                ", cart=" + cart +
                '}';
    }
}
