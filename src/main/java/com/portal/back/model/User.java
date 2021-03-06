package com.portal.back.model;

import java.util.Date;

/**
 * Created by fanlipeng on 2018/5/17 0017.
 */
public class User {

    private Integer id;         //主键
    private String userName;    //用户名
    private String password;    //用户密码
    private String nickName;    //用户昵称
    private Date createDate;    //用户创建时间
    private Date updatedate;    //用户更新时间
    private Integer isLogin;    //用户登录状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Integer getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }
}
