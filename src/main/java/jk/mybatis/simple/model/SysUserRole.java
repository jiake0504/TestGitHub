package jk.mybatis.simple.model;

import java.io.Serializable;

/**
 * 用户角色关联表
 *
 * @author jackey
 * @date   2018-10-22 22:53
 */
public class SysUserRole implements Serializable {
    private static final long serialVersionUID = -4076848943796917020L;
    /**
     * 用户ID
     * user_id
     */
    private Integer userId;

    /**
     * 角色ID
     * role_id
     */
    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}