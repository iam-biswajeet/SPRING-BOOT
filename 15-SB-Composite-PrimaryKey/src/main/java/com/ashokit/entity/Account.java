package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="ACCOUNT_DTLS")
public class Account {

	@Column(name="BRANCH_NAME")
	private String branchName;
	@Column(name="MIN_BAL")
	private double minBal;
	@EmbeddedId
	 private AccountPK accPk;
	 
}
