/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vtth.food.entity.TblUser;
import com.vtth.food.util.HibernateUtil;

/**
 * @author KMF
 *
 */
@Repository
public class UserDAOImp implements UserDAO {

    public UserDAOImp() {
        System.out.println("UserDAOImp");
    }

    @Autowired
    private HibernateUtil utils;

    public List<TblUser> getUser() {
        return utils.fetchAll(TblUser.class);
    }

    public Serializable createUser(TblUser newUser) {
        return utils.create(newUser);
    }

    public TblUser checkLogin(TblUser user) {
        List<TblUser> allUserLst = getUser();
        for (TblUser tblUser : allUserLst) {
            if (tblUser.getUserName().equals(user.getUserName()) && tblUser.getPassword().equals(user.getPassword())) {
                return tblUser;
            }
        }
        return null;
    }

}
