package com.tyss.ehub.controller;

import java.sql.ClientInfoStatus;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tyss.ehub.dto.Billable;
import com.tyss.ehub.dto.ClientsInfo;
import com.tyss.ehub.dto.ClientsInfoStatusCode;
import com.tyss.ehub.service.ClientService;

@RestController
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*",origins = "*")
@RequestMapping("/clientinfo")
public class ClientController {

	@Autowired
	private ClientService service;

	@PostMapping(path = "/clientinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientsInfoStatusCode addclientsinfo(@RequestBody ClientsInfo clientsInfo) {
			
		
		ClientsInfoStatusCode response = new ClientsInfoStatusCode();
		if (service.insert(clientsInfo)) {
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

	@DeleteMapping(path = "/clientinfo/{clientId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientsInfoStatusCode deleteclient(@PathVariable("clientId") int clientId) {
		ClientsInfoStatusCode response = new ClientsInfoStatusCode();
		if (service.delete(clientId)) {
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

	@GetMapping(path = "/clientinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientsInfoStatusCode getAll() {
		ClientsInfoStatusCode response = new ClientsInfoStatusCode();
		List<ClientsInfo> list = service.getAllClients();
		if (list == null) {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully retrived..");
		} else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data successfully retrived");
			response.setListclients(list);
		}
		return response;
	}

	@PutMapping(path = "/clientinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientsInfoStatusCode updateclient(@RequestBody ClientsInfo cinfo) {
		ClientsInfoStatusCode response = new ClientsInfoStatusCode();
		if (service.update(cinfo)) {
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
	
	@GetMapping(path="/getAllComp", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientsInfoStatusCode getAllComp() {
		ClientsInfoStatusCode response = new ClientsInfoStatusCode();
		ClientsInfo info = service.getComp();
		if (info!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data successfully getting..");
			response.setClient(info);
		} else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully getting..");
		}
		return response;
	}
	
	@GetMapping(path="/getcount", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientsInfoStatusCode getBillCount() {
		ClientsInfoStatusCode response = new ClientsInfoStatusCode();
		Map<Integer, Integer> info = service.getCountBillable();
		if (info!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data successfully getting..");
			response.setCountMap(info);
		} else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully getting..");
		}
		return response;
	}
	
	@GetMapping(path = "/getStackDetails/{clientId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientsInfoStatusCode getClientDetails(@PathVariable("clientId") int clientId) {
		ClientsInfoStatusCode response =  service.getClientDeatils(clientId);
		if (response!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data successfully retrived..");
			
		} else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully retrived..");
		}
		return response;
	}
	@SuppressWarnings("unused")
	@GetMapping(path = "/getStackCount/{clientId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientsInfoStatusCode getStackDeatils(@PathVariable("clientId") int clientId) {
		System.out.println("in controller cilent id is::"+clientId);
		ClientsInfoStatusCode response = new ClientsInfoStatusCode();
		Map<String, Integer> stackMap = service.getStackCount(clientId);
		response.setStackMap(stackMap);
		if (response!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data successfully retrived..");
		} else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully retrived..");
		}
		return response;
	}

}
