package com.springMVC.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Student {

	@Id
	private int sid;

	private String sname;

	private String saddress;
	
	private String sbirth;
	
	@Lob
	private byte[] fileUpload;
	
	

	public byte[] getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(byte[] fileUpload) {
		this.fileUpload = fileUpload;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getSbirth() {
		return sbirth;
	}

	public void setSbirth(String sbirth) {
		this.sbirth = sbirth;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sbirth=" + sbirth
				+ ", fileUpload=" + Arrays.toString(fileUpload) + "]";
	}
	
}
