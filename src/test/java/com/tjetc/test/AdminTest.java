package com.tjetc.test;

import com.tjetc.dao.AdminDao;
import com.tjetc.dao.impl.AdminDaoImpl;
import org.junit.Test;

public class AdminTest {
    AdminDao adminDao = new AdminDaoImpl();
    @Test
    public void selectAll(){
        adminDao.selectAll(2,1).getData().forEach(System.out::println);
    }
}
