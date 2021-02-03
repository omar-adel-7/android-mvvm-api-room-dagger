package com.example.androidviewmodel.di;

import com.example.androidviewmodel.data.DataManager;
import com.example.androidviewmodel.ui.CitiesViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MyModule.class, AppModule.class})
public interface MyComponent {
    void inject(CitiesViewModel citiesViewModel);
      void inject(DataManager dataManager);
}
