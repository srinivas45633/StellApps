package com.StellApps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StellApps.model.Dairy;
import com.StellApps.services.IDairyServices;

@RestController
@RequestMapping(value="dairy")
public class DairyController {
	@Autowired
	private IDairyServices dairyServices;
	@GetMapping(value="/fetchDairies")
	public ResponseEntity<List<Dairy>> fetchAllDairies(){
		List<Dairy> dairies=dairyServices.fetchAllDairyServices();	
		return new ResponseEntity<>(dairies,HttpStatus.OK);
	}
}
