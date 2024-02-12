package com.abdm.enrollment.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ABDMotpData {

    @JsonProperty ("timeStamp")
    private String timeStamp;
}
