package jk.mybatis.simple.mapper;

import jk.mybatis.simple.mapper.SysUserMapper;
import jk.mybatis.simple.model.SysPrivilege;
import jk.mybatis.simple.model.SysRole;
import jk.mybatis.simple.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author jackey
 * @version V1.0
 * @Title: SysUserMapperTest
 * @Package jk.mybatis.simple.mapper
 * @Description: SysUser测试类
 * @date 2018-10-22 23:06
 */
public class SysUserMapperTest extends BaseMapperTest{

    @Test
    public void testSelectById(){
        SqlSession sqlSession = getSqlSession();
        try {
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser user = sysUserMapper.selectByPrimaryKey(1);
            Assert.assertNotNull(user);
            Assert.assertEquals("admin",user.getUserName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try {
            SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
            List<SysUser> userList = userMapper.selectAll();
            Assert.assertNotNull(userList);
            Assert.assertTrue(userList.size() > 0);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAllUserAndRoles(){
        SqlSession sqlSession = getSqlSession();

        try {
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            List<SysUser> userList = sysUserMapper.selectAllUserAndRoles();
            System.out.println("用户数：" + userList.size());
            for(SysUser user : userList){
                System.out.println("用户名：" + user.getUserName());
                for (SysRole role : user.getRoleList()){
                    System.out.println("角色名：" + role.getRoleName());
                    for (SysPrivilege privilege : role.getPrivilegeList()){
                        System.out.println("权限名：" +privilege.getPrivilegeName() );
                    }
                }
            }
        } finally {
            sqlSession.close();
        }
    }
}
