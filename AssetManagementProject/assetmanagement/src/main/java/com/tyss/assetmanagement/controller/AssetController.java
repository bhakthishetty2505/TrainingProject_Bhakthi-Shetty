package com.tyss.assetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.assetmanagement.dto.AddAssetsBean;
import com.tyss.assetmanagement.dto.AssetResponse;
import com.tyss.assetmanagement.dto.ManagerAdminBean;
import com.tyss.assetmanagement.dto.UserBean;
import com.tyss.assetmanagement.service.AssetService;

@RestController
@RequestMapping("/assetmanagement")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AssetController {

	@Autowired
	private AssetService service;

	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse loginService(@RequestBody ManagerAdminBean user) {
		AssetResponse response = new AssetResponse();
		try {
		ManagerAdminBean bean = service.login(user.getUserId(), user.getUserPassword());
		String role = bean.getRole();
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Login Successful");
			response.setDescription("Login Successful");
			response.setRole(role);
			return response;
		} 
		}catch(Exception e) {
			e.printStackTrace();
			response.setStatusCode(401);
			response.setMessage("Login Unsuccessful. Email and Password doesn't match");
			response.setDescription("Login Unsuccessful");
			response.setRole(null);
			return response;
		}
		return response;
			
		}
	
	@PostMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse register(@RequestBody ManagerAdminBean bean) {
		AssetResponse response = new AssetResponse();
		if(service.register(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data added to the db");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the db");
		}
		return response;
	}
	@PostMapping(path = "/addAsset", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AddAssetsBean addAsset(@RequestBody AddAssetsBean asset) {
		AddAssetsBean check = service.addAsset(asset);
		if (check != null)
			return asset;
		else
			return null;
	}

	@PutMapping(path = "/updateAsset", consumes = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse updateAsset(@RequestBody AddAssetsBean asset) {
		AssetResponse response = new AssetResponse();
		if(service.updateAssetName(asset)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Assets Updated Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Assets Not Updated Successfully");
		}
		
		return response;
	}

	@GetMapping(path = "/allasset", produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse getAllDetails() {
		AssetResponse response = new AssetResponse();
		List<AddAssetsBean> list = service.getAllAsset();
		if(!list.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Assets Found Successfully");
			response.setGetAllDetails(list);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Assets weren't found");
		}

		return response;
	}

	@PostMapping(path = "/addemployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserBean addEmployee(@RequestBody UserBean bean) {
		UserBean employee = service.addEmployee(bean);
		if (employee != null) {
			return bean;
		} else {
			return null;
		}
	}

	@PostMapping(path = "/raiseReq", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse serviceRaiseReq(@RequestBody AddAssetsBean add) {
		AssetResponse response = new AssetResponse();
		if(service.acceptDeclineAllocation(add)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Request has been raised");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Error Occured while raising the request");
		}
		return response;
	}

	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean removeAsset(@RequestParam("assetId") int assetId) {
		boolean assets = service.removeAsset(assetId);
		if (assets)
			return true;
		else
			return false;
	}

	@GetMapping(path = "/requestedAsset", produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse requestedAsset() {
		AssetResponse response = new AssetResponse();
		List assets = service.requestedAsset();
		if(!assets.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Requested");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Error Occurred while requesting");
		}
		return response;
	}
	
	@PostMapping(path = "/approveAsset", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse approveAsset(@RequestBody AddAssetsBean assets) {
		AssetResponse response = new AssetResponse();
		if(service.approveAsset(assets)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Approved");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Error Occurred while Approving");
		}
		return response;
	}
	
	@PostMapping(path = "/rejectAsset", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse rejectAsset(@RequestBody AddAssetsBean assets) {
		AssetResponse response = new AssetResponse();
		if(service.rejectAsset(assets)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Rejected");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Error Occurred while rejecting");
		}
		return response;
	}
}
