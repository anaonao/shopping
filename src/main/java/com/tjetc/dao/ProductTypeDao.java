package com.tjetc.dao;

import com.tjetc.domain.ProductType;
import com.tjetc.util.Page;

public interface ProductTypeDao {

    /**
     * @param productType
     * @return
     */
    int add(ProductType productType);

    /**
     * 删除商品类型
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 修改商品类型
     * @param productType
     * @return
     */
    int update(ProductType productType);

    /**
     * 查询所有商品类型
     * @return
     */
    Page<ProductType> selectAll();
    int countAll();

    /**
     * 根据名字查询
     * @param name
     * @return
     */
    ProductType selectByName(String name);

    /**
     * 根据编号查询
     * @param id
     * @return
     */
    ProductType selectById(Integer id);

    /**
     * 根据名字模糊查询
     * @param name
     * @return
     */
    Page<ProductType> selectPageLikeName(String name);
    int countLikeName(String name);
}
