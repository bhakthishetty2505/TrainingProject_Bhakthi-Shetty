package com.tyss.ehub.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class ClientsInfoStatusCode {

	private int statusCode;
	private String message;
	private String description;
	private List<ClientsInfo> listclients;
	private List<Billable> listBill;
	private ClientsInfo client;
	Map<Integer, Integer> countMap;
	private Billable billable;
	Map<String, Integer> stackMap;
	
}
