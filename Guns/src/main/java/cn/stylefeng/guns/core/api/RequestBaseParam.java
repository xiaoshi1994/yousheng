package cn.stylefeng.guns.core.api;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.alibaba.druid.util.StringUtils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * API模块访问对象基础参数
 * @author SHF
 * @version 创建时间：2018年12月27日  下午1:41:06
 * @param <T>
 */
@ApiModel
public class RequestBaseParam<T> {
	
	/**
     * 用户定位区域编码
     */
    /*@NotNull(message = "area不能为空")
    @Length(min = 6, max = 6, message = "area长度为6")
    @ApiModelProperty(value = "用户定位区域编码")
    private String area;*/


    /**
     * 提交的数据进行base64签名，针对敏感接口（支付）采用对称加密算法进行加密
     */
    /*@ApiModelProperty(value = "data")
    private String data;*/

    /**
     * 客户端根据一定规则生成的md5验证码，以保证数据访问的安全性； Sign值32位，不为空
     */
    @NotNull(message = "sign不能为空")
    @Length(min = 32, max = 32, message = "sign长度为32")
    @ApiModelProperty(value = "sign")
    private String sign;

    /**
     * 时间戳：客户端生成加密值时的时间戳；加一位设备类型 时间戳（13位）+设备类型（1位）共14位，不为空
     */
    @NotNull(message = "tt不能为空")
    @Length(min = 14, max = 14, message = "tt长度为14")
    @ApiModelProperty(value = "时间戳")
    private String tt;

    /**
     * 用户ID， 可为空
     */
    @ApiModelProperty(value = "用户ID")
    private Integer uid;

    private T t;

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getTt() {
		return tt;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
    
	public String transfer(){
        StringBuilder builder = new StringBuilder();
        if(!StringUtils.isEmpty(tt)){
            builder.append("tt=").append(tt).append("&");
        }
        if(uid != null){
            builder.append("uid=").append(uid).append("&");
        }
        return builder.toString();
    }
}
