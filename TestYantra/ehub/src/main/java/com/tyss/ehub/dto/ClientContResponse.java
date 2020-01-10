package com.tyss.ehub.dto;

import java.util.List;

import lombok.Data;

@Data
public class ClientContResponse {

	private int statusCode;
	private String message;
	private String description;
	private ClientContactInfo cliInfo;
	private List<ClientContactInfo> listCInfo;

}
