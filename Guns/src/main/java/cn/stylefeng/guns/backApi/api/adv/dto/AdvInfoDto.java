package cn.stylefeng.guns.backApi.api.adv.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * 广告模块请求封装对象
 * @author SHF
 * @version 创建时间：2018年12月27日  下午1:56:43
 */
public class AdvInfoDto {
	
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
