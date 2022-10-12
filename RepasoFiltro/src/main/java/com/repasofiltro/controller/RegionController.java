package com.repasofiltro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.repasofiltro.Service.RegionService;


@RestController
@RequestMapping ("/trabajo/descripcion")
@CrossOrigin(origins = "http://localhost:4200")
public class RegionController {
	
	@Autowired
	private RegionService regioservi;
	
	@GetMapping("/listapaises")
	@ResponseBody
	public List<String> listapaises(){
		return regioservi.listadodepaises();
	}

}
