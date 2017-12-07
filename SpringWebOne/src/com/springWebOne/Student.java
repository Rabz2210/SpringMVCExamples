package com.springWebOne;

import java.util.LinkedHashMap;

public class Student {
	
	private String fname;
	private String lname;
	private String countary;
	private LinkedHashMap<String, String> coptions;
	
	public Student() {
		coptions = new LinkedHashMap<String, String>();
		coptions.put("IND", "India");
		coptions.put("BRA", "Brazil");
		coptions.put("UK", "United Kingdom");
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCountary() {
		return countary;
	}

	public void setCountary(String countary) {
		this.countary = countary;
	}

	public LinkedHashMap<String, String> getCoptions() {
		return coptions;
	}
	
	

}
