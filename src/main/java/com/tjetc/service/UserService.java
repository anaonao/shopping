package com.tjetc.service;

import com.tjetc.dao.User;
import com.tjetc.util.Page;

public interface UserService {
    /**
     * 用户登录
     * @param name
     * @param pwd
     * @return
     */
    User findNameAndPwd(String name, String pwd);

    /**
     * 用户注册
     * @param user
     * @return
     */
    User userRegister(User user);

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
    Page<User> findUserPageAll();
    int userCountAll();

    /**
     * 根据编号查询用户信息
     * @param id
     * @return
     */
    User findUserById(int id);

    /**
     * 根据姓名查询用户
     * @param name
     * @return
     */
    User findUserByName(String name);

    /**
     * 根据姓名模糊查询
     * @param name
     * @return
     */
    Page<User> findUserPageLikeName(String name);
    int userCountLikeName(String name);

    /**
     * 根据手机号模糊查询
     * @param phone
     * @return
     */
    Page<User> findUserPageLikePhone(String phone);
    int userCountLikePhone(String phone);

    /**
     * 根据状态查询
     * @param state
     * @return
     */
    Page<User> findUserPageByState(int state);
    int userCountByState(int state);
}
