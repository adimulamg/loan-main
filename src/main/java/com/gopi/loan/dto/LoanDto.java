package com.gopi.loan.dto;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class LoanDto {

    @NotEmpty(message = "loanId can not be a null or empty")
    @Pattern(regexp="(^$|[0-9]{3})",message = "LoanNumber must be 3 digits")
    private String loanId;
    
    @NotEmpty(message = "loanProductId can not be a null or empty")
    @Pattern(regexp="(^$|[0-9]{3})",message = "loanProductId must be 3 digits")
    private String loanProductId;

    @Positive(message = "openingBalance can not be a null or empty")
    private Double openingBalance;
    
    @Positive(message = "currentBalance can not be a null or empty")
    private Double currentBalance;

    @Positive(message = "Total paymentAmount should be greater than zero")
    private Double paymentAmount;
    
   // @NotEmpty(message = "paymentDate can not be a null or empty")
    private Date paymentDate;
    
    @NotEmpty(message = "interestRate can not be a null or empty")
    private Float interestRate;

}
