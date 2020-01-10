package com.tyss.ehub.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.ehub.dto.PackageBillable;
import com.tyss.ehub.dto.PackageResponse;
import com.tyss.ehub.service.PackageBillableService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RequestMapping("/package")
public class PackageBillableController {
	@Autowired
	private PackageBillableService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@PostMapping(path = "/package", produces = MediaType.APPLICATION_JSON_VALUE)
	public PackageResponse addPakageinfo(@RequestBody PackageBillable pakg) {
		PackageResponse response = new PackageResponse();
		if (service.addPackage(pakg)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data successfully stored..");
		} else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully stored..");
		}
		return response;
	}

	@DeleteMapping(path = "/package/{pakgId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public PackageResponse deletePackage(@PathVariable("pakgId") int pakgId) {
		PackageResponse response = new PackageResponse();
		if (service.removePackage(pakgId)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data successfully deleted..");
		} else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully deleted..");
		}
		return response;
	}

	@GetMapping(path = "/package", produces = MediaType.APPLICATION_JSON_VALUE)
	public PackageResponse getAll() {
		PackageResponse response = new PackageResponse();
		List<PackageBillable> list = service.getAllPackage();
		if (list == null) {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully retrived..");
		} else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data successfully retrived");
			response.setListPackageBillables(list);
			;
		}
		return response;
	}

	@PutMapping(path = "/package", produces = MediaType.APPLICATION_JSON_VALUE)
	public PackageResponse updatePakageBillable(@RequestBody PackageBillable packageBillable) {
		PackageResponse response = new PackageResponse();
		if (service.updatePackage(packageBillable)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data successfully updated..");
		} else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully updated..");
		}
		return response;
	}

}
