package com.reagan.views.dto;

public class Tip {
	
	private static ResultObject<Object> tipMeg(String msg, boolean isValue) {
		ResultObject<Object> result = new ResultObject<Object>();
		result.setMessage(msg);
		result.setSuccess(isValue);
		return result;
	}

	public static ResultObject<Object> addSuccess() {
		return tipMeg("添加成功", true);
	}
	
	public static ResultObject<Object> editSuccess() {
		return tipMeg("修改成功", true);
	}
	
	public static ResultObject<Object> removeSuccess() {
		return tipMeg("删除成功", true);
	}
	
	public static ResultObject<Object> addFailure() {
		return tipMeg("系统异常添加失败", true);
	}
	
	public static ResultObject<Object> editFailure() {
		return tipMeg("系统异常修改失败", true);
	}
	
	public static ResultObject<Object> removeFailure() {
		return tipMeg("系统异常删除失败", true);
	}
	
	public static ResultObject<Object> loginOuttime() {
		return tipMeg("登录超时", true);
	}
	
	public static ResultObject<Object> passwordError() {
		return tipMeg("密码错误修改失败", true);
	}
	
	public static ResultObject<Object> uploadSuccess() {
		return tipMeg("文件上传成功", true);
	}
	
	public static ResultObject<Object> uploadError(String msg) {
		return tipMeg("文件上传失败" + msg, true);
	}
	
	public static ResultObject<Object> uniqueError(String msg) {
		return tipMeg(msg + "重复", true);
	}

}
