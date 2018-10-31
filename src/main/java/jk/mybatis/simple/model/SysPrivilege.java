package jk.mybatis.simple.model;

import java.io.Serializable;

/**
 * 权限表
 *
 * @author jackey
 * @date   2018-10-22 22:53
 */
public class SysPrivilege implements Serializable {
    private static final long serialVersionUID = 6320306239896659733L;
    /**
     * privilege_id
     */
    private Integer privilegeId;

    /**
     * 权限名称
     * privilege_name
     */
    private String privilegeName;

    /**
     * 权限URL
     * privilege_url
     */
    private String privilegeUrl;

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName == null ? null : privilegeName.trim();
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl == null ? null : privilegeUrl.trim();
    }
}