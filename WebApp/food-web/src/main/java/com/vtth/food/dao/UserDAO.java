/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import com.vtth.food.entity.TblUser;

/**
 * @author SONY
 *
 */
public interface UserDAO {

    public List<TblUser> getUser();
    public Serializable createUser(TblUser newUser);
    public TblUser checkLogin (TblUser user);
}
