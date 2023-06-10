package com.vandee.aplikasikita.model;

import com.google.gson.annotations.SerializedName;

public class ApiResponse {

    @SerializedName("status")
    private String status;

    @SerializedName("status_code")
    private int statusCode;

    @SerializedName("name")
    private String name;

    public String getStatus() {
        return status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getName() {
        return name;
    }
}
