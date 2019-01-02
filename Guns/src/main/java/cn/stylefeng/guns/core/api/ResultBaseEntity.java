package cn.stylefeng.guns.core.api;

import java.io.Serializable;

/**
 * API 返回结果集基础封装对象
 * @author SHF
 * @version 创建时间：2018年12月27日  下午1:49:08
 * @param <T>
 */
public class ResultBaseEntity<T> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer code;
    private String message;
    private T data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
