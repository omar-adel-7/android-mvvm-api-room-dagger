package com.example.androidviewmodel.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.androidviewmodel.MyApp;
import com.example.androidviewmodel.data.Repositories.CitiesRepository;
import com.example.androidviewmodel.data.beans.CitiesResponse;

import javax.inject.Inject;

public class CitiesViewModel extends AndroidViewModel  {

    @Inject
    CitiesRepository citiesRepository;

    public CitiesViewModel(@NonNull Application application) {
        super(application);
        ((MyApp)application).getMyComponent().inject(this);
     }

     public LiveData<CitiesResponse> getCities(AppCompatActivity appCompatActivity  , boolean hasCache ) {
        return citiesRepository.getCities(appCompatActivity,hasCache);
     }

}
