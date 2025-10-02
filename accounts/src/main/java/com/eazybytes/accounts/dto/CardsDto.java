package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Schema(name = "Cards", description = "Schema to hold Card information")
public class CardsDto {
    @Schema(description = "Mobile number of customer", example = "1234567890")
    @NotEmpty(message = "Mobile number cannot be null or empty")
    @Pattern(regexp = "(^[0-9]{10}$)", message = "mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Card number of customer", example = "1111222233334444")
    @NotEmpty(message = "Card number cannot be null or empty")
    @Pattern(regexp = "(^[0-9]{12}$)", message = "Card number must be 12 digits")
    private String cardNumber;

    @Schema(description = "Type of the card", example = "Debit card")
    @NotEmpty(message = "Card type cannot be null or empty")
    private String cardType;

    @Schema(description = "Total amount limit of the card", example = "10000")
    @Positive(message = "Total card limit should be greater than zero")
    private int totalLimit;

    @Schema(description = "Amount used on the card by the customer", example = "5000")
    @PositiveOrZero(message = "Total amount used on the card must be equal or greater than zero")
    private int amountUsed;

    @Schema(description = "Available amount on the card", example = "5000")
    @PositiveOrZero(message = "Available amount on the card must be equal or greater than zero")
    private int availableAmount;
}
