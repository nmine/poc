package be.nmine.util;

import be.nmine.domain.MyBean;

public class MyBeanBuilder {
	private int anyInt = 1;
	private String anyString = "1";
	
	public  MyBeanBuilder withAnyInt(int anyInt) {
		this.anyInt = anyInt;
		return this;
	}

	public MyBeanBuilder withAnyString(String anyString) {
		this.anyString = anyString;
		return this;
	}
	
	public MyBean build() {
		MyBean myBean = new MyBean();
		myBean.setAnyNumber(this.anyInt);
		myBean.setAnyString(this.anyString);
		return myBean;
	}
}
