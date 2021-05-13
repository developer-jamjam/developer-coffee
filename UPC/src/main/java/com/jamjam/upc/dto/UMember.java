package com.jamjam.upc.dto;

public class UMember {
	private String Upid;
	private String Uppw;
	private String Upname;
	private String Upphone;
	private String Upaddress;
	private String Uptype;
	
	public String getUpid() {
		return Upid;
	}
	public void setUpid(String upid) {
		Upid = upid;
	}
	public String getUppw() {
		return Uppw;
	}
	public void setUppw(String uppw) {
		Uppw = uppw;
	}
	public String getUpname() {
		return Upname;
	}
	public void setUpname(String upname) {
		Upname = upname;
	}
	public String getUpphone() {
		return Upphone;
	}
	public void setUpphone(String upphone) {
		Upphone = upphone;
	}
	public String getUpaddress() {
		return Upaddress;
	}
	public void setUpaddress(String upaddress) {
		Upaddress = upaddress;
	}
	public String getUptype() {
		return Uptype;
	}
	public void setUptype(String uptype) {
		Uptype = uptype;
	}
	
	@Override
	public String toString() {
		return "UMember [Upid=" + Upid + ", Uppw=" + Uppw + ", Upname=" + Upname + ", Upphone=" + Upphone
				+ ", Upaddress=" + Upaddress + ", Uptype=" + Uptype + "]";
	}
	

	
}
