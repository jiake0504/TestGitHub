package jk.mybatis.simple.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户表
 *
 * @author jackey
 * @date   2018-10-22 22:53
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = 9081893897447068230L;
    /**
     * user_id
     */
    private Integer userId;

    /**
     * 用户名
     * user_name
     */
    private String userName;

    /**
     * 密码
     * user_password
     */
    private String userPassword;

    /**
     * 邮箱
     * user_email
     */
    private String userEmail;

    /**
     * 创建日间
     * create_time
     */
    private Date createTime;

    /**
     * 简介
     * user_info
     */
    private String userInfo;

    /**
     * 头像
     * head_img
     */
    private byte[] headImg;

    /**
     * 用户所拥有的角色
     */
    private List<SysRole> roleList;

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }

    public byte[] getHeadImg() {
        return headImg;
    }

    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }
}