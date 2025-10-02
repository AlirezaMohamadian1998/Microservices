package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(name = "Customer", description = "Schema to hold Customer and Account information")
public class CustomerDto {

    @Schema(description = "Name of the Customer", example = "John Doe")
    @NotBlank(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of customer name should be between 5 and 30 characters")
    private String name;

    @Schema(description = "Email of the Customer", example = "JohnDoe@example.com")
    @NotBlank(message = "Email address cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(description = "Mobile number of the Customer", example = "5313914653")
    @Pattern(regexp = "(^[0-9]{10}$)", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Accounts details of the Customer")
    @Valid
    private AccountsDto accountsDto;
}