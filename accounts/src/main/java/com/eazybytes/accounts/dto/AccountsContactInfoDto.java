package com.eazybytes.accounts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
@Setter @Getter
public class AccountsContactInfoDto {
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;

}

//public record AccountsContactInfoDto(String message, Map<String, ContactDetails contactDetails , List<String> onCallSupport) {
//    public record ContactDetails(String email, String phoneNumber) {}
//}

