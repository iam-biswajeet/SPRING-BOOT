package com.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="USER_DTLS")
public class User {
	@Id
	/*
	 * @SequenceGenerator(name = "id_seq" ,
	 * sequenceName="user_id_seq",allocationSize = 1 )
	 * 
	 * @GeneratedValue(generator="id_seq", strategy=GenerationType.SEQUENCE)
	 */
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.TABLE)
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
	
	@Column(name="CREATED_DATE")
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(name="UPDATED_DATE")
	@UpdateTimestamp
	private LocalDate updatedDate;
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
