package com.gopi.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gopi.loan.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

}
