package com.codelabuk.usermgmt.actuatorEndPoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id="userAppInfo")
public class UserAppInfoEndpoint {

    @ReadOperation
    public UserAppInfo userAppInfo(){
        UserAppInfo userAppInfo = new UserAppInfo();
        Map<String, Object> healthDtls = new HashMap<>();
        healthDtls.put("App Location", "//path from lake");
        healthDtls.put("Status0", "All ok");
        userAppInfo.setHealthDetails(healthDtls);
        return userAppInfo;
    }

    public String userAppEndPointByName(@Selector String name){
        return "User Management Operation: "+ name;
    }
}
