/**
 * -----------------------------------
 * 林风社交论坛开源版本请务必保留此注释头信息
 * 开源地址: https://gitee.com/virus010101/linfeng-community
 * 商业版详情查看: https://www.linfengtech.cn
 * 商业版购买联系技术客服		QQ:  3582996245
 * 可正常分享和学习源码，不得转卖或非法牟利！
 * Copyright (c) 2021-2025 linfeng all rights reserved.
 * 版权所有 ，侵权必究！
 * -----------------------------------
 */
package io.sixlaws.common.exception;

/**
 * 自定义异常
 *
 */
public class Exception extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
    private String msg;
    private int code = 500;
    
    public Exception(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public Exception(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}
	
	public Exception(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}
	
	public Exception(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
