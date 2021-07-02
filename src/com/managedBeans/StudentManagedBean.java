package com.managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

@ManagedBean(name = "studentManagedBean")
@ApplicationScoped
public class StudentManagedBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String rollNum;
	private String country;
    
	public List<String> getCountries() {
		List<String> countries = new ArrayList<String>();
		countries.add("Pakistan");
		countries.add("India");
		countries.add("Bangla");
		return countries;
		
	}

	public StudentManagedBean(){}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		System.out.println("Name G =="+name);
		System.out.println("Country G=="+country);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNum() {
		return rollNum;
	}
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	
	public String display(){
		System.out.println("Name=="+name);
		System.out.println("Country=="+country);
		//return "response.xhtml";
		return "SUCCESS";
	}

}
