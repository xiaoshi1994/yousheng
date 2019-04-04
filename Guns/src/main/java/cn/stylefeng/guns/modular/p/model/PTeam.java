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
 * 团队表
 * </p>
 *
 * @author shiye
 * @since 2019-04-03
 */
@TableName("p_team")
public class PTeam extends Model<PTeam> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 团队名称
     */
    private String name;
    /**
     * 队长id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 总接单数量
     */
    @TableField("answer_count")
    private Integer answerCount;
    /**
     * 状态：1：待审核  2：正常运行  3：被锁定   4：审核驳回
     */
    private Integer status;
    private Integer creator;
    private Integer modifier;
    private Date created;
    private Date modified;
    @TableField("is_deleted")
    private Integer isDeleted;
    @TableField("is_enable")
    private Integer isEnable;
    /**
     * 总金额
     */
    private Long money;
    /**
     * 总完成数量
     */
    @TableField("finish_answer_count")
    private Integer finishAnswerCount;
    /**
     * 描述，包含审核失败的原因
     */
    private String descs;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Integer getFinishAnswerCount() {
        return finishAnswerCount;
    }

    public void setFinishAnswerCount(Integer finishAnswerCount) {
        this.finishAnswerCount = finishAnswerCount;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "PTeam{" +
        ", id=" + id +
        ", name=" + name +
        ", userId=" + userId +
        ", answerCount=" + answerCount +
        ", status=" + status +
        ", creator=" + creator +
        ", modifier=" + modifier +
        ", created=" + created +
        ", modified=" + modified +
        ", isDeleted=" + isDeleted +
        ", isEnable=" + isEnable +
        ", money=" + money +
        ", finishAnswerCount=" + finishAnswerCount +
        ", descs=" + descs +
        "}";
    }
}
