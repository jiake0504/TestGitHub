package jk.mybatis.simple.model;

import java.io.Serializable;

/**
 * @author jackey
 * @version V1.0
 * @Title: Country
 * @Package jk.mybatis.simple.model
 * @Description: Country数据映射类
 * @date 2018-10-11 14:01
 */
public class Country implements Serializable {

    private static final long serialVersionUID = 2541750450972993030L;
    private Integer id;    //城市主键
    private String countryname;//城市名称
    private String countrycode;//城市编码


    public Country(Integer id, String countryname, String countrycode) {
        this.id = id;
        this.countryname = countryname;
        this.countrycode = countrycode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
