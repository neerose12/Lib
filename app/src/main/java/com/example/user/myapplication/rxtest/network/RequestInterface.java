package com.example.user.myapplication.rxtest.network;


import com.example.user.myapplication.rxtest.model.Android;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("android/jsonarray/")
    Observable<List<Android>> register();
}
