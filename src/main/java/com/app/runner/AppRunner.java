package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my")
public class AppRunner implements CommandLineRunner{
	@Value("${my.data}")
	private int empId;
	@Value("${my.code}")
	private String empName;
	@Value("${my.sal}")
	private double empSal;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "AppRunner [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	

}
