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
 * 车队用户成员表
 * </p>
 *
 * @author shiye
 * @since 2019-04-03
 */
@TableName("p_team_user")
public class PTeamUser extends Model<PTeamUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("p_u_id")
    private Integer pUId;
    /**
     * 司机id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 团对id
     */
    @TableField("team_id")
    private Integer teamId;
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
     * 修改时间
     */
    private Date modified;
    /**
     * 是否删除 1 不删除 0：删除
     */
    @TableField("is_deleted")
    private Integer isDeleted;
    /**
     * 是否可用 1 可用   0：不可用
     */
    @TableField("is_enable")
    private String isEnable;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpUId() {
        return pUId;
    }

    public void setpUId(Integer pUId) {
        this.pUId = pUId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
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

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "PTeamUser{" +
        ", id=" + id +
        ", pUId=" + pUId +
        ", userId=" + userId +
        ", teamId=" + teamId +
        ", creator=" + creator +
        ", modifier=" + modifier +
        ", created=" + created +
        ", modified=" + modified +
        ", isDeleted=" + isDeleted +
        ", isEnable=" + isEnable +
        "}";
    }
}
