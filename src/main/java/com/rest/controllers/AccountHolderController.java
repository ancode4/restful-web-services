package com.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.beans.AccountHolder;
import com.rest.services.AccountHolderService;

@RestController
public class AccountHolderController {
	
	@Autowired
	AccountHolderService service;
	
	@GetMapping(path="/account-holder")
	public ResponseEntity getAllAccountHolders() {
		List<AccountHolder> data = service.getAllAccountHolders();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	private List<AccountHolder> getAccountHolders(){
		List<AccountHolder> holders = new ArrayList<>();
		
		AccountHolder holder1 = new AccountHolder();
		holder1.setId(1L);
		
		
		return holders;
	}
}
