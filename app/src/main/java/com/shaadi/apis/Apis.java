package com.shaadi.apis;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 11-01-2019
 */
public class Apis {
    private String userApi = "https://randomuser.me/api/?results=10";

    public String getUserApi() {
        return userApi;
    }

    public void setUserApi(String userApi) {
        this.userApi = userApi;
    }
}
