package com.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.currencyexchangeservice.Model.ExchangeValue;

public interface ExchangeValueRepository extends 
        JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);
	
}
