package com.ashokit.response;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@XmlRootElement
@Table(name="Ticket")
public class Ticket {
	@Id
	@Column(name="tkt_id")
	@GeneratedValue
	private Integer ticketId;
	@Column(name="status")
	private String status;
	@Column(name="cost")
	private Float cost;
	@Column(name="pnr")
	private Integer pnr;
	@Column(name="first")
	private String from;
	@Column(name="dest")
	private String to;
	@Column(name="j_date")
	private Date jdate;
	@Column(name="name")
	private String name;

}
