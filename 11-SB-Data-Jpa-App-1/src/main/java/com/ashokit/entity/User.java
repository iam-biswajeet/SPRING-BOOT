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
	Integer id;
	@Column(name="USER_NAME")
	String name;
	@Column(name="USER_PHNO")
	Long mob;
	@Column(name="USER_AGE")
	Integer age;
	@Column(name="USER_COUNTRY")
	String country;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mob=" + mob + ", age=" + age + ", country=" + country + "]";
	}
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
	public Long getMob() {
		return mob;
	}
	public void setMob(Long mob) {
		this.mob = mob;
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
	

}
