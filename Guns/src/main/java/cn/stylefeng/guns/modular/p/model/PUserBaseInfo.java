package cn.stylefeng.guns.modular.p.model;

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
 * 乘客和司机表
 * </p>
 *
 * @author shiye
 * @since 2019-04-03
 */
@TableName("p_user_base_info")
public class PUserBaseInfo extends Model<PUserBaseInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户编号
     */
    @TableField("user_sn")
    private String userSn;
    /**
     * 用户手机号
     */
    private String mobile;
    /**
     * 密码
     */
    private String password;
    /**
     * md5密码盐（考虑到APP端密码加密规则的兼容性，此值暂不使用）
     */
    private String salt;
    private String nickname;
    /**
     * 头像
     */
    @TableField("head_thumb")
    private String headThumb;
    /**
     * 位置数据
     */
    @TableField("location_area")
    private String locationArea;
    /**
     * 地区
     */
    private String region;
    /**
     * 个人介绍
     */
    private String synopsis;
    /**
     * 车牌号
     */
    @TableField("license_plate_number")
    private String licensePlateNumber;
    /**
     * 状态：1：正常使用，2：等在认证: 3：被冻结
     */
    private Integer starts;
    /**
     * 身份证号码
     */
    @TableField("identity_card")
    private String identityCard;
    /**
     * 信用分
     */
    private BigDecimal integral;
    /**
     * 用户身份，1：乘客；2：司机
     */
    private Integer identity;
    /**
     * 微信openid
     */
    private String openid;
    /**
     * 微信授权用户唯一标识
     */
    private String unionid;
    /**
     * app的openid
     */
    @TableField("app_open_id")
    private String appOpenId;
    /**
     * 融云token
     */
    private String token;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别，1男，2女，保密
     */
    private String sex;
    /**
     * 用户佣金余额
     */
    private BigDecimal money;
    /**
     * 我的邀请码
     */
    @TableField("my_invite")
    private String myInvite;
    /**
     * 推荐人
     */
    private Integer pid;
    /**
     * 层级数，0,1,2,3,4....
     */
    private Integer level;
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

    public String getUserSn() {
        return userSn;
    }

    public void setUserSn(String userSn) {
        this.userSn = userSn;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadThumb() {
        return headThumb;
    }

    public void setHeadThumb(String headThumb) {
        this.headThumb = headThumb;
    }

    public String getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(String locationArea) {
        this.locationArea = locationArea;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public BigDecimal getIntegral() {
        return integral;
    }

    public void setIntegral(BigDecimal integral) {
        this.integral = integral;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getAppOpenId() {
        return appOpenId;
    }

    public void setAppOpenId(String appOpenId) {
        this.appOpenId = appOpenId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getMyInvite() {
        return myInvite;
    }

    public void setMyInvite(String myInvite) {
        this.myInvite = myInvite;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
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
        return "PUserBaseInfo{" +
        ", id=" + id +
        ", userSn=" + userSn +
        ", mobile=" + mobile +
        ", password=" + password +
        ", salt=" + salt +
        ", nickname=" + nickname +
        ", headThumb=" + headThumb +
        ", locationArea=" + locationArea +
        ", region=" + region +
        ", synopsis=" + synopsis +
        ", licensePlateNumber=" + licensePlateNumber +
        ", starts=" + starts +
        ", identityCard=" + identityCard +
        ", integral=" + integral +
        ", identity=" + identity +
        ", openid=" + openid +
        ", unionid=" + unionid +
        ", appOpenId=" + appOpenId +
        ", token=" + token +
        ", name=" + name +
        ", sex=" + sex +
        ", money=" + money +
        ", myInvite=" + myInvite +
        ", pid=" + pid +
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
