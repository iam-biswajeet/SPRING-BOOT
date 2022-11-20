package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DTLS")
public class User {
	@Id
	@Column(name="USER_ID")
	private int userId;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="USER_PHNO")
	private long userPhno;
	@Column(name="USER_AGE")
	private int userAge;
	@Column(name="USER_COUNTRY")
	private String userCountry;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserphno() {
		return userPhno;
	}
	public void setUserphno(long userphno) {
		userPhno = userphno;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", Userphno=" + userPhno + ", userAge=" + userAge
				+ ", userCountry=" + userCountry + "]";
	}
	
}
