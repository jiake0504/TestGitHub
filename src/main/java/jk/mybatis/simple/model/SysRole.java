package jk.mybatis.simple.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 角色表
 *
 * @author jackey
 * @date   2018-10-22 22:53
 */
public class SysRole implements Serializable {
    private static final long serialVersionUID = -6782094946348436087L;
    /**
     * role_id
     */
    private Integer roleId;

    /**
     * 角色名
     * role_name
     */
    private String roleName;

    /**
     * 有效标志
     * role_enabled
     */
    private Integer roleEnabled;

    /**
     * 创建人
     * create_by
     */
    private Integer createBy;

    /**
     * 创建时间
     * create_time
     */
    private Date createTime;

    /**
     * 创建信息
     */
    private CreateInfo createInfo;

    /**
     * 角色所拥有的权限列表
     * @return List<SysPrivilege>
     */
    public List<SysPrivilege> getPrivilegeList() {
        return privilegeList;
    }

    public CreateInfo getCreateInfo() {
        return createInfo;
    }

    public void setCreateInfo(CreateInfo createInfo) {
        this.createInfo = createInfo;
    }

    public void setPrivilegeList(List<SysPrivilege> privilegeList) {
        this.privilegeList = privilegeList;
    }

    private List<SysPrivilege> privilegeList;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleEnabled() {
        return roleEnabled;
    }

    public void setRoleEnabled(Integer roleEnabled) {
        this.roleEnabled = roleEnabled;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}