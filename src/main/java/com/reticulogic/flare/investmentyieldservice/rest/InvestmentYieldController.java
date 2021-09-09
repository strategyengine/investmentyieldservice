package com.reticulogic.flare.investmentyieldservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reticulogic.flare.investmentyieldservice.model.Investment;
import com.reticulogic.flare.investmentyieldservice.service.YieldLookupService;

//TODO:  

@RestController
public class InvestmentYieldController {

	@Autowired
	private YieldLookupService yieldLookupService;
	
	
	@RequestMapping(value = "/api/investmentyields", method = RequestMethod.GET)
	public List<Investment> investments() {
		return yieldLookupService.getInvestmentYields();
	}

}