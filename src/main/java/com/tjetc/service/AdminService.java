package com.tjetc.service;

import com.tjetc.domain.Admin;
import com.tjetc.util.Page;

public interface AdminService {
    /**
     * 管理员登录
     * @param name
     * @param Pwd
     * @return
     */
    Admin adminLogin(String name, String Pwd);

    /**
     * 添加管理员
     * @param admin
     * @return
     */
    int addAdmin(Admin admin);

    /**
     * 删除管理员
     * @param id
     * @return
     */
    int deleteAdminById(int id);

    /**
     * 修改管理员
     * @param admin
     * @return
     */
    int updateAdmin(Admin admin);
    //查询都是分页

    /**
     * 查询所有管理员
     * @return
     */
    Page<Admin> findAdminAll();
    int adminAllCount();

    /**
     * 根据名称查询
     * @param name
     * @return
     */
    Admin findAdminByName(String name);

    /**
     * 根据编号查询
     * @param id
     * @return
     */
    Admin findAdminById(int id);

    /**
     * 根据名称模糊查询
     * @param name
     * @return
     */
    Page<Admin> findAdminByLikeName(String name);
    int adminByLikeNameCount(String name);

    /**
     * 根据状态查询
     * @param state
     * @return
     */
    Page<Admin> findAdminByState(int state);
    int adminByStateCount(int state);

    /**
     * 根据手机号模糊查询
     * @param phone
     * @return
     */
    Page<Admin> findAdminByLikePhone(String phone);
    int adminByLikePhoneCount(String phone);
}
