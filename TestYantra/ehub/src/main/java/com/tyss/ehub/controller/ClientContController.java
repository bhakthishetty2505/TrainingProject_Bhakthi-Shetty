package com.tyss.ehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.ehub.dto.ClientContResponse;
import com.tyss.ehub.dto.ClientContactInfo;
import com.tyss.ehub.service.ClientContService;

@RestController
@RequestMapping("/clientcont")
public class ClientContController {

	@Autowired
	private ClientContService conservice;

	@PostMapping(path = "/clientcont", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientContResponse add(@RequestBody ClientContactInfo cInfo) {
		ClientContResponse response = new ClientContResponse();
		if (conservice.addClientCont(cInfo)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data  successfully stored..");
		} else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully stored..");
			response.getCliInfo();
		}
		return response;
	}

	@PutMapping(path = "/clientcont", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientContResponse updateBook(@RequestBody ClientContactInfo cliCont) {
		ClientContResponse response = new ClientContResponse();
		if (conservice.updateClientCont(cliCont)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data  successfully updated..");
		} else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully updated..");
		}
		return response;
	}

	@DeleteMapping(path = "/clientcont/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientContResponse deleteUser(@PathVariable int bId) {
		ClientContResponse response = new ClientContResponse();
		if (conservice.deleteClientCont(bId)) {
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

	@GetMapping(path = "/clientcont", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientContResponse getAll() {
		ClientContResponse response = new ClientContResponse();
		List<ClientContactInfo> list = conservice.getClientCont();
		if (list == null) {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not successfully retrived..");
		} else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data  successfully retrived");
			response.setListCInfo(list);
		}
		return response;
	}
}
