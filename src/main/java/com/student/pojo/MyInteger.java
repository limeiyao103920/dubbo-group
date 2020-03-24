package com.student.pojo;

import java.io.Serializable;

public class MyInteger  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6101740267681211839L;
	int val;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	/**
	 * 自定义合并方法
	 * @param mi
	 * @return
	 */
	public MyInteger myMerge(MyInteger mi) {
		return new MyInteger(this.val + mi.val);
	}

	
	public MyInteger(int val) {
		super();
		this.val = val;
	}

	@Override
	public String toString() {
		return "MyInteger [val=" + val + "]";
	}
	
	
	

}
