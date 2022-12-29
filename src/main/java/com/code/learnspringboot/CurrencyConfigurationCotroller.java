package com.code.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CurrencyConfigurationCotroller {
	
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;

	@GetMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses() {
		return currencyServiceConfiguration;
	}

}
