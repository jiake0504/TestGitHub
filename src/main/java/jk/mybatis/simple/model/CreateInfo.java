package jk.mybatis.simple.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jackey
 * @version V1.0
 * @Title: CreateInfo
 * @Package jk.mybatis.simple.model
 * @Description: 表公共字段
 * @date 2018-10-26 19:11
 */
public class CreateInfo implements Serializable {
    private static final long serialVersionUID = 7420567959134116214L;

    /**
     * 创建人
     */
    private Integer createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
