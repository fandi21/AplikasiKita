package com.vandee.aplikasikita.util;

import com.vandee.aplikasikita.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {
    @Headers({
            "Accept: application/json",
            "x-rainbow-client: android",
            "x-rainbow-client-version: 1.10.7"
    })

    @POST("register.php")
    @FormUrlEncoded
    Call<ApiResponse> performUserRegisIn(
            @Field("name") String name,
            @Field("user_name") String user_name,
            @Field("password") String password);

    @POST("login.php")
    @FormUrlEncoded
    Call<ApiResponse> performUserSignIn(
            @Field("user_name") String userName,
            @Field("password") String password);
}
