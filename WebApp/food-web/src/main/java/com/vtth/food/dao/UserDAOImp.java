/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vtth.food.entity.TblUser;

/**
 * @author SONY
 *
 */
@Repository // bắt buộc phải có
public class UserDAOImp implements UserDAO {

    // Constructor
    
    
    // Khai báo HibernateUtil đây
    
    public List<TblUser> getUser() {
        // TODO Auto-generated method stub
        return null;
    }

    public Serializable createUser(TblUser newUser) {
        // TODO Auto-generated method stub
        return null;
    }

    public TblUser checkLogin(TblUser user) {
        // TODO Auto-generated method stub
        return null;
    }

}
