/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vtth.food.entity.TblUser;
import com.vtth.food.util.HibernateUtil;

/**
 * @author MHVTu
 *
 */
@Repository // bắt buộc phải có
public class UserDAOImp implements UserDAO {

    // Constructor
    public UserDAOImp() {
        System.out.println("UserDAOImp");
    }
    
    // Khai báo HibernateUtil đây
    private HibernateUtil utils;
    
    public List<TblUser> getUser() {
        // TODO Auto-generated method stub
        return utils.fetchAll(TblUser.class);
    }

    public Serializable createUser(TblUser newUser) {
        // TODO Auto-generated method stub
        return utils.create(newUser);
    }

    public TblUser checkLogin(TblUser user) {
        // TODO Auto-generated method stub
        return (TblUser) utils.fetchAll(TblUser.class);
    }

}
