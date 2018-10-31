package jk.mybatis.simple.mapper;

import java.util.List;
import jk.mybatis.simple.model.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(Integer roleId);

    List<SysRole> selectAll();

    List<SysRole>  selectAllRoleAndPrivileges();

    int updateByPrimaryKey(SysRole record);
}