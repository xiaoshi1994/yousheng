package cn.stylefeng.guns.modular.s.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 轨迹信息表
 * </p>
 *
 * @author shiye
 * @since 2019-04-03
 */
@TableName("s_driving_trajectory")
public class SDrivingTrajectory extends Model<SDrivingTrajectory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 行程记录id 就是订单id
     */
    @TableField("drive_id")
    private Integer driveId;
    /**
     * 经度
     */
    @TableField("lng_rat")
    private Double lngRat;
    /**
     * 纬度
     */
    @TableField("lat_rat")
    private Double latRat;
    /**
     * 创建人
     */
    private Integer creator;
    /**
     * 创建时间
     */
    private Date created;
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

    public Integer getDriveId() {
        return driveId;
    }

    public void setDriveId(Integer driveId) {
        this.driveId = driveId;
    }

    public Double getLngRat() {
        return lngRat;
    }

    public void setLngRat(Double lngRat) {
        this.lngRat = lngRat;
    }

    public Double getLatRat() {
        return latRat;
    }

    public void setLatRat(Double latRat) {
        this.latRat = latRat;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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
        return "SDrivingTrajectory{" +
        ", id=" + id +
        ", driveId=" + driveId +
        ", lngRat=" + lngRat +
        ", latRat=" + latRat +
        ", creator=" + creator +
        ", created=" + created +
        ", isDeleted=" + isDeleted +
        "}";
    }
}
