package jk.mybatis.simple.model;

import java.io.Serializable;

/**
 * 角色权限关联表
 *
 * @author jackey
 * @date   2018-10-22 22:53
 */
public class SysRolePrivilege implements Serializable {
    private static final long serialVersionUID = 8091368055250723243L;
    /**
     * 角色ID
     * role_id
     */
    private Integer roleId;

    /**
     * 权限ID
     * privilege_id
     */
    private Integer privilegeId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }
}