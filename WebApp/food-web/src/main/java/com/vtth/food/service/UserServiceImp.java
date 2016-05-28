/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vtth.food.dao.UserDAO;
import com.vtth.food.entity.TblUser;

/**
 * @author KMF
 *
 */

@Service
@Transactional
public class UserServiceImp implements UserService {
    
    @Autowired
    UserDAO userDAO;
    public UserServiceImp() {
        System.out.println("UserServiceImp()");
    }
    
    public Serializable createUser(TblUser newUser) {
        return userDAO.createUser(newUser);
    }

    public TblUser checkLogin(TblUser user) {
        // TODO Auto-generated method stub
        return null;
    }

}
