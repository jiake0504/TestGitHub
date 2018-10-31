package jk.mybatis.generator;


import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

/**
 * @author jackey
 * @version V1.0
 * @Title: MyCommentGenerator
 * @Package jk.mybatis.generator
 * @Description: 自己实现的注释生成器
 * @date 2018-10-11 19:01
 */
public class MyCommentGenerator extends DefaultCommentGenerator {

    /**
     * 由于默认实现类中的可配参数都没有提供给子类可以访问的方法，这里妥定义一边
     */
    private  boolean  suppressAllComrnents;
    private  boolean  addRemarkComrnents ;
    /**
     * 设直用户画己直的参数
     */
    public void addConfigurationProperties(Properties properties) {
        //允调用父类方法保证父类方法可以正常使用
        super.addConfigurationProperties(properties);
        //获取 suppressAllComrnents 参数值
        suppressAllComrnents = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
        //获取 addRemarkComrnents 参数值
        addRemarkComrnents = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_ADD_REMARK_COMMENTS));
    }

    /**
     * 给字段添加注释信息
     */
    public  void  addFieldComrnent(Field field,
                                   IntrospectedTable introspectedTable,
                                   IntrospectedColumn introspectedColumn)  {
        //如果阻止生成所有注释，直接返回
        if(suppressAllComrnents){
            return;
        }
        //文档注释开始
        field.addJavaDocLine("/**");
        //获取数据库字段的备注信息
        String remarks =  introspectedColumn.getRemarks();
        //根据参数和备注信息判断是否添加备注信息
        if(addRemarkComrnents && StringUtility.stringHasValue(remarks)){
            String[] remarkLines = remarks.split(System.getProperty("line.separator"));
            for(String remarkLine : remarkLines){
                field.addJavaDocLine(" * " + remarkLine);
            }
        }
        //由于Java 对象名和数据库字段名可能不一样，注释中保留数据库字段名
        field.addJavaDocLine("* " + introspectedColumn.getActualColumnName());
        field.addJavaDocLine(" */");
    }
}
