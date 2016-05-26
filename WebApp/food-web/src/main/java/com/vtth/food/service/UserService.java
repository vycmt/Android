/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import com.vtth.food.entity.TblUser;

/**
 * @author SONY
 *
 */
public interface UserService {

    public List<TblUser> getUser();
    public Serializable createUser(TblUser newUser);
    public TblUser checkLogin (TblUser user);
}
