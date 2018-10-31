package jk.mybatis.simple.mapper;

import java.util.List;
import jk.mybatis.simple.model.SysPrivilege;

public interface SysPrivilegeMapper {
    int deleteByPrimaryKey(Integer privilegeId);

    int insert(SysPrivilege record);

    SysPrivilege selectByPrimaryKey(Integer privilegeId);

    List<SysPrivilege> selectAll();

    int updateByPrimaryKey(SysPrivilege record);
}