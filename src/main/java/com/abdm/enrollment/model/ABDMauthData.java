package com.abdm.enrollment.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ABDMauthData {

    @JsonProperty ("authMethods")
    private List<String> authMethods;

    @JsonProperty("otp")
    private ABDMotpData otp;
}
