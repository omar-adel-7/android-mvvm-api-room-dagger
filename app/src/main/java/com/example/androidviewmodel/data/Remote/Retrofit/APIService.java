package com.example.androidviewmodel.data.Remote.Retrofit;

import com.example.androidviewmodel.data.beans.CitiesResponse;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {


    @POST("cities")
    Call<CitiesResponse> getCities(
            @Body RequestBody body
            );


}
