package com.ashokit.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

//import lombok.AllArgsConstructor;
import lombok.Data;
@Data
//@AllArgsConstructor
@Embeddable
public class AccountPK implements Serializable {
	private Integer accId;
	private String accType;
	private String holderName;

}
