package com.codelabuk.usermgmt.actuatorEndPoint;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserAppInfo {

    Map<String , Object> healthDetails;
    public Map<String, Object> getHealthDetails() {
        return healthDetails;
    }

    public void setHealthDetails(Map<String, Object> healthDetails) {
        this.healthDetails = healthDetails;
    }


}
