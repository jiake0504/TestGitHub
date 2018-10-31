package jk.mybatis.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import sun.nio.cs.Surrogate;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jackey
 * @version V1.0
 * @Title: MybatisGenerator
 * @Package jk.mybatis.generator
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2018-10-16 19:37
 */
public class MybatisGenerator {
    public static void main(String[] args) {
        //MBG 执行过程中的警告信息
        List<String> warnings = new ArrayList<String>();
        //当 生成的代码重复时，覆盖原代码
        boolean  overwrite  =  true ;
        try {
            //读取 MBG 配直文件
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream("generator/generatorConfig.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(is);
            is.close();
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            //创建MBG
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            //执行生成代码
            myBatisGenerator.generate(null);
            //输出警告信息
            for (String warning : warnings){
                System.out.println(warning);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
