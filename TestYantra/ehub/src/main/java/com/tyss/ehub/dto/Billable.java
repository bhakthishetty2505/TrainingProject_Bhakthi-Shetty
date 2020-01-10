package com.tyss.ehub.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Billable {
	@Id
	@GeneratedValue
	private int employeeId;
	@Column
	private String empName;
	@Column
	private Date deployementDate;
	@Column
	private Date contractEndDate;
	@Column
	private double rateCardPerMonth;
	@Column
	private String stack;
	@Column
	private int yoe;
	@Column
	private int compId;
	
}
