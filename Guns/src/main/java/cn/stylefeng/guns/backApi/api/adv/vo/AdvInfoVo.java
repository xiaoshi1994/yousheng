package cn.stylefeng.guns.backApi.api.adv.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * API返回对象封装
 * @author SHF
 * @version 创建时间：2018年12月27日  下午2:07:57
 */
public class AdvInfoVo {

	@ApiModelProperty(value = "广告id")
	private Integer id;
	
	@ApiModelProperty(value = "广告名称")
	private String name;

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
	
}
