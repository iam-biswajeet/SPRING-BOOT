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
	private Integer id;
	@Column(name="USER_NAME")
	private String name;
	@Column(name="USER_PHNO")
	private Long phno;
	@Column(name="USER_AGE")
	private Integer age;
	@Column(name="USER_COUNTRY")
	private String country;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phno=" + phno + ", age=" + age + ", country=" + country + "]";
	}
	
}
