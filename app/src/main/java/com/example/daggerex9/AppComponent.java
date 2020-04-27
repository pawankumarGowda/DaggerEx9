package com.example.daggerex9;

import javax.inject.Singleton;

import dagger.Component;

@Component (modules = DriverModule.class)
@Singleton
public interface AppComponent {
    Driver getDriver();
}
