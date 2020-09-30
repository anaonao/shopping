package com.tjetc.dao;

import com.tjetc.domain.SalesReturn;
import com.tjetc.util.Page;

import java.util.Date;

public interface SalesReturnDao {
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
    Page<SalesReturn> selectAll();
    int countAll();

    /**
     * 根据编号查询订单信息
     * @param id
     * @return
     */
    SalesReturn selectById(String id);

    /**
     * 根据时间范围查询
     * @param startDate
     * @param endStart
     * @return
     */
    Page<SalesReturn> selectLikeDate(Date startDate, Date endStart);
    int countLikeDate(Date startDate,Date endStart);

    /**
     * 根据用户名查询
     * @param userName
     * @return
     */
    Page<SalesReturn> selectByUserName(String userName);
    int countByUserName(String userName);
}
