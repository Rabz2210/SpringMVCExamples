package com.springWebOne;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Student {
	
	private String fname;
	@NotNull(message="is required")
	@Size(min=5,message="is required")
	private String lname;
	private String countary;
	private LinkedHashMap<String, String> coptions;
	private String favLang;
	
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

	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}
	
	

}
