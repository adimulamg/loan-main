package com.gopi.loan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopi.loan.constants.LoanConstants;
import com.gopi.loan.dto.ResponseDto;
import com.gopi.loan.entity.Loan;
import com.gopi.loan.service.ILoanService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api", produces = { MediaType.APPLICATION_JSON_VALUE })
@AllArgsConstructor
@Validated
public class LoanController {
	private ILoanService iLoanService;

	@PostMapping("/loan/create")
	public ResponseEntity<ResponseDto> createLoan(@RequestBody Loan loan) {
		iLoanService.createLoan(loan);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new ResponseDto(LoanConstants.STATUS_201, LoanConstants.MESSAGE_201));
	}
}
