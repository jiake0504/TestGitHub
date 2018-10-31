package jk.mybatis.simple.mapper;

import java.util.List;
import jk.mybatis.simple.model.SysUserRole;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    List<SysUserRole> selectAll();
}