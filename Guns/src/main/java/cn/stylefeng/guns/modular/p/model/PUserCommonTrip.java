package cn.stylefeng.guns.modular.p.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 常用行程表
 * </p>
 *
 * @author shiye
 * @since 2019-04-03
 */
@TableName("p_user_common_trip")
public class PUserCommonTrip extends Model<PUserCommonTrip> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 开始地点
     */
    @TableField("start_place")
    private String startPlace;
    /**
     * 结束地点
     */
    @TableField("end_place")
    private String endPlace;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
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
        return "PUserCommonTrip{" +
        ", id=" + id +
        ", userId=" + userId +
        ", startPlace=" + startPlace +
        ", endPlace=" + endPlace +
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
