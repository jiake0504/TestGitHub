package jk.mybatis.simple.mapper;

import java.util.List;
import jk.mybatis.simple.model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Integer userId);

    List<SysUser> selectAll();

    List<SysUser> selectAllUserAndRoles();
    int updateByPrimaryKey(SysUser record);
}