package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Schema(name = "Accounts", description = "Schema to hold Account information")
@Data
public class AccountsDto {
    @Schema(description = "Account number of Eazy Bank account", example = "1234567890")
    @NotNull(message = "AccountNumber cannot be null")
    @Min(value = 1000000000L, message = "AccountNumber must be 10 digits")
    @Max(value = 9999999999L, message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Schema(description = "Account type of Eazy Bank account", example = "Savings")
    @NotEmpty(message = "AccountType cannot be null or empty")
    private String accountType;

    @Schema(description = "Eazy Bank branch address", example = "Main Street, New York")
    @NotEmpty(message = "BranchAddress cannot be null or empty")
    private String branchAddress;
}
