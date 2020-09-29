package com.tjetc.service;

import com.tjetc.domain.Product;
import com.tjetc.util.Page;

public interface ProductService {
    /**
     * 添加商品
     * @param product
     * @return
     */
    int add(Product product);

    /**
     * 删除商品
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 修改商品
     * @param product
     * @return
     */
    int update(Product product);

    /**
     * 查询所有商品
     * @return
     */
    Page<Product> findAll();
    int countAll();

    /**
     * 根据编号查询商品
     * @param id
     * @return
     */
    Product findById(int id);

    /**
     * 根据名称模糊查询商品
     * @param name
     * @return
     */
    Page<Product> findLikeName(String name);
    int countLikeName(String name);

    /**
     * 根据价格范围查询商品
     * @param startPrice
     * @param endPrice
     * @return
     */
    Page<Product> findLikePrice(Double startPrice,Double endPrice);
    int countLikePrice(Double startPrice,Double endPrice);

    /**
     * 根据商品热范围查询商品
     * @param startHot
     * @param endHot
     * @return
     */
    Page<Product> findLikeHot(int startHot,int endHot);
    int countLikeHot(int startHot,int endHot);
}
