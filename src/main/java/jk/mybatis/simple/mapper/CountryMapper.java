package jk.mybatis.simple.mapper;

import jk.mybatis.simple.model.Country;

import java.util.List;

/**
 * @author jackey
 * @version V1.0
 * @Title: CountryMapper
 * @Package jk.mybatis.simple.mapper
 * @Description: 城市Dao类
 * @date 2018-10-22 22:51
 */
public interface CountryMapper {
    List<Country> selectAll();
}
