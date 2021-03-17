package com.itwill.shop.domain;

public class Address {
	
/*
 * 이름             널?       유형            
-------------- -------- ------------- 
ADDRESS_NO     NOT NULL NUMBER(10)    
ADDRESS_NAME            VARCHAR2(100) 
ADDRESS_DETAIL          VARCHAR2(100) 
ADDRESS_TYPE            NUMBER(10)    
MEMBERS_NO              NUMBER(10)   
 */
	
private Integer addressNo;
private String addressName;
private String addressDetail;
private Integer addressType;
private Integer membersNo;

public Address() {
	
}


public Address(Integer addressNo, String addressName, String addressDetail, Integer addressType, Integer membersNo) {
	super();
	this.addressNo = addressNo;
	this.addressName = addressName;
	this.addressDetail = addressDetail;
	this.addressType = addressType;
	this.membersNo = membersNo;
}


public Address(Integer addressNo) {
	super();
	this.addressNo = addressNo;
}


public Integer getAddressNo() {
	return addressNo;
}


public void setAddressNo(Integer addressNo) {
	this.addressNo = addressNo;
}


public String getAddressName() {
	return addressName;
}


public void setAddressName(String addressName) {
	this.addressName = addressName;
}


public String getAddressDetail() {
	return addressDetail;
}


public void setAddressDetail(String addressDetail) {
	this.addressDetail = addressDetail;
}


public Integer getAddressType() {
	return addressType;
}


public void setAddressType(Integer addressType) {
	this.addressType = addressType;
}


public Integer getMembersNo() {
	return membersNo;
}


public void setMembersNo(Integer membersNo) {
	this.membersNo = membersNo;
}


@Override
public String toString() {
	return "Address [addressNo=" + addressNo + ", addressName=" + addressName + ", addressDetail=" + addressDetail
			+ ", addressType=" + addressType + ", membersNo=" + membersNo + "]";
}


}
