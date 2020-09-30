package com.tjetc.service;

import com.tjetc.domain.SalesReturn;
import com.tjetc.util.Page;

import java.util.Date;

public interface SalesReturnService {
    /**
     * 添加退货订单
     * @param salesReturn
     * @return
     */
    int add(SalesReturn salesReturn);

    /**
     * 查询订单信息
     * @return
     */
    Page<SalesReturn> findAll();
    int countAll();

    /**
     * 根据编号查询订单信息
     * @param id
     * @return
     */
    SalesReturn findById(String id);

    /**
     * 根据时间范围查询
     * @param startDate
     * @param endStart
     * @return
     */
    Page<SalesReturn> findLikeDate(Date startDate, Date endStart);
    int countLikeDate(Date startDate,Date endStart);

    /**
     * 根据用户名查询
     * @param userName
     * @return
     */
    Page<SalesReturn> findByUserName(String userName);
    int countByUserName(String userName);
}
