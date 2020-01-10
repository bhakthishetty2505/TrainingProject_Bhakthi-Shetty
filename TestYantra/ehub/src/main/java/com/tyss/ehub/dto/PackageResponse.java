package com.tyss.ehub.dto;

import java.util.List;

import lombok.Data;

@Data
public class PackageResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<PackageBillable> listPackageBillables;
	
}
