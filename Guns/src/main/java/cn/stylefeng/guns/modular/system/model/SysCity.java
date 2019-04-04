package cn.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 城市列表
 * </p>
 *
 * @author shiye
 * @since 2019-04-03
 */
@TableName("sys_city")
public class SysCity extends Model<SysCity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 城市名
     */
    private String city;
    /**
     * 经度
     */
    private BigDecimal lng;
    /**
     * 纬度
     */
    private BigDecimal lat;
    /**
     * 区号
     */
    private String qu;
    /**
     * 城市编码
     */
    @TableField("city_code")
    private String cityCode;
    /**
     * 父类编码
     */
    @TableField("parent_code")
    private String parentCode;
    /**
     * 等级（省市区）
     */
    private String level;
    /**
     * 排序
     */
    @TableField("sort_num")
    private Integer sortNum;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否启用,0不启用，1启用
     */
    @TableField("is_enable")
    private Integer isEnable;
    /**
     * 创建人
     */
    private Integer creator;
    /**
     * 修改人
     */
    private Integer modifier;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 最后修改时间
     */
    private Date modified;
    /**
     * 0正常，1删除
     */
    @TableField("is_deleted")
    private Integer isDeleted;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysCity{" +
        ", id=" + id +
        ", city=" + city +
        ", lng=" + lng +
        ", lat=" + lat +
        ", qu=" + qu +
        ", cityCode=" + cityCode +
        ", parentCode=" + parentCode +
        ", level=" + level +
        ", sortNum=" + sortNum +
        ", remark=" + remark +
        ", isEnable=" + isEnable +
        ", creator=" + creator +
        ", modifier=" + modifier +
        ", created=" + created +
        ", modified=" + modified +
        ", isDeleted=" + isDeleted +
        "}";
    }
}
