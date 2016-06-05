package com.vtth.food.entity;
// Generated May 20, 2016 3:45:49 PM by Hibernate Tools 5.1.0.Alpha1

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user", catalog = "fooddb")
public class TblUser implements java.io.Serializable {

    /** . */
    private static final long serialVersionUID = -9120956157817520238L;
    private Integer userId;
    private String userName;
    private String password;

    public TblUser() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "UserID", unique = true, nullable = false)
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "UserName", nullable = false)
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "Password", nullable = false)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
