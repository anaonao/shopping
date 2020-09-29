package com.tjetc.dao;

import com.tjetc.util.Page;

public interface User {

    /**
     * 用户登录
     * @param name
     * @param pwd
     * @return
     */
    User selectNameAndPwd(String name,String pwd);

    /**
     * 用户注册
     * @param user
     * @return
     */
    User addUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUserById(int id);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 查询所有用户信息
     * @return
     */
    Page<User> selectUserPageAll();
    int userCountAll();

    /**
     * 根据编号查询用户信息
     * @param id
     * @return
     */
    User selectUserById(int id);

    /**
     * 根据姓名查询用户
     * @param name
     * @return
     */
    User selectUserByName(String name);

    /**
     * 根据姓名模糊查询
     * @param name
     * @return
     */
    Page<User> selectUserPageLikeName(String name);
    int userCountLikeName(String name);

    /**
     * 根据手机号模糊查询
     * @param phone
     * @return
     */
    Page<User> selectUserPageLikePhone(String phone);
    int userCountLikePhone(String phone);

    /**
     * 根据状态查询
     * @param state
     * @return
     */
    Page<User> selectUserPageByState(int state);
    int userCountByState(int state);
}
