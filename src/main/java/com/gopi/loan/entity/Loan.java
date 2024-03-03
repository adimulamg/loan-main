package com.gopi.loan.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Loan  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Range(max = 999)
    private Long loanId;
   
    @NotNull
    @Column(length = 3)
    private Long customerId;
    
    @NotNull
    private Long loanProductId;
    
    @NotNull
    private BigDecimal openingBalance;
    
    @NotNull
    private BigDecimal currentBalance;
    
    @NotNull
    private BigDecimal paymentAmount;
    
    @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date paymentDate;
    
    @NotNull
    private Float rate;
}
