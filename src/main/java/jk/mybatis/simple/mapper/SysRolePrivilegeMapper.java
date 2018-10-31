package jk.mybatis.simple.mapper;

import java.util.List;
import jk.mybatis.simple.model.SysRolePrivilege;

public interface SysRolePrivilegeMapper {
    int insert(SysRolePrivilege record);

    List<SysRolePrivilege> selectAll();
}