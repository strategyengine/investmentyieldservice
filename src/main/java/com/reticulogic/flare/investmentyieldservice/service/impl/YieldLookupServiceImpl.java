package com.reticulogic.flare.investmentyieldservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reticulogic.flare.investmentyieldservice.model.Investment;
import com.reticulogic.flare.investmentyieldservice.service.YieldLookupService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class YieldLookupServiceImpl implements YieldLookupService {

	@Autowired
	private YieldLookupService assetLookupService;
	
	@Override
	public List<Investment> getInvestmentYields() {
		return null;
	}
	


}
