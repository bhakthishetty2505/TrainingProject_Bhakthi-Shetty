package com.tyss.ehub.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class ClientContactInfo {
	@Id
	@GeneratedValue
	private int clientInfoId;
//	@JoinColumn(name = "clientId")
//	@ManyToOne(cascade = CascadeType.ALL)
//	private ClientsInfo clientsId;
	@Column
	private String contactPersonName;
	@Column
	private String contactPersonCatageory;
	@Column
	private double contactPersonNumber;
	@Column
	private String contactPersonEmail;
}
