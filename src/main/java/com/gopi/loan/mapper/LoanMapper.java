package com.gopi.loan.mapper;

import com.gopi.loan.dto.LoanDto;
import com.gopi.loan.entity.Loan;

public class LoanMapper {

    public static LoanDto mapToloanDto(Loan loan, LoanDto loanDto) {
		/*
		 * loanDto.setLoanNumber(loan.getLoanNumber());
		 * loanDto.setAmountPaid(loan.getAmountPaid());
		 */
        return loanDto;
    }

    public static Loan mapToloan(LoanDto loanDto, Loan loan) {
		/*
		 * loan.setLoanNumber(loanDto.getLoanNumber());
		 * loan.setAmountPaid(loanDto.getAmountPaid());
		 */
        return loan;
    }

}
