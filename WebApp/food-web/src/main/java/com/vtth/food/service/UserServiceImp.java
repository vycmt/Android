/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vtth.food.entity.TblUser;

/**
 * @author SONY
 *
 */
@Service
@Transactional
public class UserServiceImp implements UserService {

    public UserServiceImp() {
        System.out.println("UserServiceImp()");
    }
    
    public Serializable createUser(TblUser newUser) {
        // TODO Auto-generated method stub
        return null;
    }

    // để t implement
    public TblUser checkLogin(TblUser user) {
        // TODO Auto-generated method stub
        return null;
    }

}
