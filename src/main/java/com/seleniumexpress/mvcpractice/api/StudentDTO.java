package com.seleniumexpress.mvcpractice.api;

public class StudentDTO {
	
	private String name = "dude";
	private String mobile = "+9888234";  //are we sure we use String?
	private String country = "Russia";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


}
