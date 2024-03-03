package com.gopi.loan.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gopi.loan.dto.LoanDto;
import com.gopi.loan.entity.Loan;
import com.gopi.loan.exception.ResourceNotFoundException;
import com.gopi.loan.mapper.LoanMapper;
import com.gopi.loan.repository.LoanRepository;
import com.gopi.loan.service.ILoanService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoanServiceImpl implements ILoanService {
	private LoanRepository loanRepository;

	/**
	 * @param Loan - Loan Object of the Customer
	 * @return the new loan details
	 */
	@Override
	public void createLoan(Loan loan) {
		loanRepository.save(createNewLoan(loan));
	}

	/**
	 * @param Loan - Loan Object of the Customer
	 * @return the new loan details
	 */
	private Loan createNewLoan(Loan loan) {
		Loan newLoan = new Loan();
		newLoan.setCustomerId(loan.getCustomerId());
		newLoan.setLoanProductId(loan.getLoanProductId());
		newLoan.setOpeningBalance(loan.getOpeningBalance());
		newLoan.setCurrentBalance(loan.getCurrentBalance());
		newLoan.setPaymentAmount(loan.getPaymentAmount());
		newLoan.setPaymentDate(loan.getPaymentDate());
		newLoan.setRate(loan.getRate());

		return newLoan;
	}
}
