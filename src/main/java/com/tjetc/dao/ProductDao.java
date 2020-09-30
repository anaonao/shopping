package com.tjetc.dao;

import com.tjetc.domain.Product;
import com.tjetc.util.Page;

public interface ProductDao {

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
    int delete(Integer id);

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
    Page<Product> selectAll();
    int countAll();

    /**
     * 根据编号查询商品
     * @param id
     * @return
     */
    Product selectById(Integer id);

    /**
     * 根据名称模糊查询商品
     * @param name
     * @return
     */
    Page<Product> selectLikeName(String name);
    int countLikeName(String name);

    /**
     * 根据价格范围查询商品
     * @param startPrice
     * @param endPrice
     * @return
     */
    Page<Product> selectLikePrice(Double startPrice,Double endPrice);
    int countLikePrice(Double startPrice,Double endPrice);

    /**
     * 根据商品销量降序查询
     * @param Sales
     * @return
     */
    Page<Product> selectLikeSales(Integer Sales);
    int countLikeSales(Integer Sales);
    //根据商品
}
