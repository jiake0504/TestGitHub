package jk.mybatis.simple.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

/**
 * @author jackey
 * @version V1.0
 * @Title: BaseMapperTest
 * @Package jk.mybatis.simple.mapper
 * @Description: 基础测试类
 * @date 2018-10-19 11:06
 */
public class BaseMapperTest implements Serializable {
    private static final long serialVersionUID = 1518201398388759958L;
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        }catch (IOException ignore){
            ignore.printStackTrace();
        }
    }
    public SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
