package com.abdm.enrollment.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ABDMEnrollViaAdhaar {

    @JsonProperty ("authData")
    private ABDMauthData authData;

    @JsonProperty ("consent")
    private ABDMconsentData consent;

}
