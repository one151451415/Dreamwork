package com.alv.dream.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alv.dream.dto.PercentageAddDTO;
import com.alv.dream.service.PercentageService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("dream")
public class PercentageController {

	@Autowired
	PercentageService percentageService;
	
	@PostMapping("add")
	public String postMap(@RequestBody PercentageAddDTO request) {
		
		
		if(request.getC()==request.getVc()) {
			throw new RuntimeException("Cap and vice captain can't be same");
		}
        System.out.println("Add call received");
		return percentageService.addPercentage(request);
	}
	
	@GetMapping("totalcount")
	public long getRecordCount() throws Exception {
		return percentageService.getRecordCount();
	}
}
