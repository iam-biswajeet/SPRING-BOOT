package com.ashokit.request;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Passenger {
	private String name;
	private String email;
	private  Long phno;
	private String from;
	private String to;
	private Date jdate;
	private Integer trainNum;

}
