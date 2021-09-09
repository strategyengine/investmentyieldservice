package com.reticulogic.flare.investmentyieldservice;

import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.reticulogic.flare.investmentyieldservice.http.HttpClientUtil;


@Configuration
public class InvestmentYieldServiceConfig {

	@Bean
	public CloseableHttpClient closeableHttpClient() {
		return HttpClientUtil.createCloseableHttpClient(5, 5, 30000, 20000, 20000, 20000);
	}


}
