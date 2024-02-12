package com.abdm.enrollment.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ABDMRequestOTP {
    @JsonProperty("txnId")
    private String txnId;

    @JsonProperty("scope")
    private List<String> scope;

    @JsonProperty("loginHint")
    private String loginHint = "aadhaar";

    @JsonProperty("loginId")
    private String loginId;

    @JsonProperty("otpSystem")
    private String otpSystem = "aadhaar";


}
