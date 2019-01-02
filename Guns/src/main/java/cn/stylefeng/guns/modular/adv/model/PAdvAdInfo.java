package cn.stylefeng.guns.modular.adv.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 广告信息记录表
 * </p>
 *
 * @author shi
 * @since 2018-12-27
 */
@TableName("p_adv_ad_info")
public class PAdvAdInfo extends Model<PAdvAdInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 广告位置id
     */
    @TableField("ad_position_id")
    private Integer adPositionId;
    /**
     * 广告位编号
     */
    @TableField("ad_sn")
    private String adSn;
    /**
     * 广告名称
     */
    private String name;
    /**
     * 数据来源
     */
    private Integer source;
    /**
     * 对象类型，0：无；1：产品；2：品牌店铺；3：外部链接
     */
    private Integer type;
    /**
     * 引用对象的id，
     */
    @TableField("object_id")
    private Integer objectId;
    /**
     * 开始时间
     */
    @TableField("start_time")
    private Date startTime;
    /**
     * 结束时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 主标题
     */
    @TableField("main_title")
    private String mainTitle;
    /**
     * 副标题
     */
    @TableField("sub_heading")
    private String subHeading;
    /**
     * 图片
     */
    @TableField("image_src")
    private String imageSrc;
    /**
     * 图片属性
     */
    @TableField("image_alt")
    private String imageAlt;
    /**
     * 背景颜色
     */
    @TableField("background_color")
    private String backgroundColor;
    /**
     * 链接URL
     */
    private String url;
    /**
     * 状态，0：未开始；1：进行中；2：已结束
     */
    private Integer status;
    /**
     * 点击数
     */
    @TableField("click_count")
    private Integer clickCount;
    /**
     * 区域编码
     */
    private String area;
    /**
     * 0:不是全部有效 1：全部有效
     */
    @TableField("is_all")
    private Integer isAll;
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
    /**
     * 关联的一级商品分类ID
     */
    @TableField("goods_cate_id")
    private Integer goodsCateId;
    /**
     * 是否关联商品分类
     */
    @TableField("is_relate_goods_cate")
    private Integer isRelateGoodsCate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdPositionId() {
        return adPositionId;
    }

    public void setAdPositionId(Integer adPositionId) {
        this.adPositionId = adPositionId;
    }

    public String getAdSn() {
        return adSn;
    }

    public void setAdSn(String adSn) {
        this.adSn = adSn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getSubHeading() {
        return subHeading;
    }

    public void setSubHeading(String subHeading) {
        this.subHeading = subHeading;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getImageAlt() {
        return imageAlt;
    }

    public void setImageAlt(String imageAlt) {
        this.imageAlt = imageAlt;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getIsAll() {
        return isAll;
    }

    public void setIsAll(Integer isAll) {
        this.isAll = isAll;
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

    public Integer getGoodsCateId() {
        return goodsCateId;
    }

    public void setGoodsCateId(Integer goodsCateId) {
        this.goodsCateId = goodsCateId;
    }

    public Integer getIsRelateGoodsCate() {
        return isRelateGoodsCate;
    }

    public void setIsRelateGoodsCate(Integer isRelateGoodsCate) {
        this.isRelateGoodsCate = isRelateGoodsCate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "PAdvAdInfo{" +
        ", id=" + id +
        ", adPositionId=" + adPositionId +
        ", adSn=" + adSn +
        ", name=" + name +
        ", source=" + source +
        ", type=" + type +
        ", objectId=" + objectId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", mainTitle=" + mainTitle +
        ", subHeading=" + subHeading +
        ", imageSrc=" + imageSrc +
        ", imageAlt=" + imageAlt +
        ", backgroundColor=" + backgroundColor +
        ", url=" + url +
        ", status=" + status +
        ", clickCount=" + clickCount +
        ", area=" + area +
        ", isAll=" + isAll +
        ", sortNum=" + sortNum +
        ", remark=" + remark +
        ", isEnable=" + isEnable +
        ", creator=" + creator +
        ", modifier=" + modifier +
        ", created=" + created +
        ", modified=" + modified +
        ", isDeleted=" + isDeleted +
        ", goodsCateId=" + goodsCateId +
        ", isRelateGoodsCate=" + isRelateGoodsCate +
        "}";
    }
}
