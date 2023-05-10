package cn.jxufe.bean;

public class Message {
	/**
	 * 代码:code 为0表示无错误，负数表示某种类型的错误
	 */
	private int code;
	private String msg;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
