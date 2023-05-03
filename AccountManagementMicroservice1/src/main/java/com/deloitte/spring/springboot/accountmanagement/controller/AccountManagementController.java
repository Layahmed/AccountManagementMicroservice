package com.deloitte.spring.springboot.accountmanagement.controller;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/account")
public class AccountManagementController {

	@Operation(summary = "It's the Get API to get an User by its id")
		@RequestMapping(method = RequestMethod.GET, value ="/")
		public String healthCheck() {
			return "Account management is up and running";
		}

		//@PostMapping("/create")
	@Operation(summary = "It's the Get API for creating Account")
		@RequestMapping(method = RequestMethod.GET, value = "/createAccount")
		public String createAccount() {
			return "Account created";
			
		}
		
		//@PutMapping("/updateAccount")
	@Operation(summary = "It's the Get API for update Account")
		@RequestMapping(method = RequestMethod.GET, value = "/updateAccount" )
		public String updateAccount() {
			return "Account updated";
		}
		
	@Operation(summary = "It's the Get API for delete Account")
		@RequestMapping(method = RequestMethod.GET, value = "/deleteAccount" )
		public String deleteAccount() {
			return "Account deleted";
		}
		
	@Operation(summary = "It's the Get API for getting Account Id")
		@RequestMapping(method = RequestMethod.GET, value = "/accountId/{accountId}")
		public String getAccountId(@PathVariable(name = "accountId") String accountId) {
			return "Given accountid is: " +accountId;
		}
		
	@Operation(summary = "It's the Get API for getting Account Details")
		@RequestMapping(method = RequestMethod.GET, value = "/accountDetails")
		public String getAccountDetails(@RequestParam(name = "uname") String uname) {
			return "Given account details is: " + uname;
}
}
