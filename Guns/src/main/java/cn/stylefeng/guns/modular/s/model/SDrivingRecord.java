package cn.stylefeng.guns.modular.s.model;

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
 * 行乘记录表
 * </p>
 *
 * @author shiye
 * @since 2019-04-03
 */
@TableName("s_driving_record")
public class SDrivingRecord extends Model<SDrivingRecord> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("p_u_id2")
    private Integer pUId2;
    /**
     * 乘客用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 司机用户id
     */
    @TableField("driver_id")
    private Integer driverId;
    /**
     * 开始时间
     */
    @TableField("start_date")
    private Date startDate;
    /**
     * 接单时间
     */
    @TableField("receipt_date")
    private Date receiptDate;
    /**
     * 结束时间
     */
    @TableField("end_date")
    private Date endDate;
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
     * 订单状态 0:已取消, 1:待接单，2:已接单 ，3：进行中 ，4：已完成 , 5:已评价 ,
     */
    private Integer status;
    /**
     * 总价格
     */
    @TableField("totle_price")
    private BigDecimal totlePrice;
    /**
     * 优惠价格
     */
    @TableField("discount_price")
    private BigDecimal discountPrice;
    /**
     * 实付价格
     */
    @TableField("pay_price")
    private BigDecimal payPrice;
    /**
     * 人数
     */
    private Integer number;
    /**
     * 备注
     */
    private String remark;
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
    /**
     * 发布类型：1 ：乘客发布  2：司机发布
     */
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpUId2() {
        return pUId2;
    }

    public void setpUId2(Integer pUId2) {
        this.pUId2 = pUId2;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getTotlePrice() {
        return totlePrice;
    }

    public void setTotlePrice(BigDecimal totlePrice) {
        this.totlePrice = totlePrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SDrivingRecord{" +
        ", id=" + id +
        ", pUId2=" + pUId2 +
        ", userId=" + userId +
        ", driverId=" + driverId +
        ", startDate=" + startDate +
        ", receiptDate=" + receiptDate +
        ", endDate=" + endDate +
        ", startPlace=" + startPlace +
        ", endPlace=" + endPlace +
        ", status=" + status +
        ", totlePrice=" + totlePrice +
        ", discountPrice=" + discountPrice +
        ", payPrice=" + payPrice +
        ", number=" + number +
        ", remark=" + remark +
        ", creator=" + creator +
        ", created=" + created +
        ", isDeleted=" + isDeleted +
        ", type=" + type +
        "}";
    }
}
