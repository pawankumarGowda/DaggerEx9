package com.example.daggerex9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car1;
    @Inject Car car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent component = DaggerActivityComponent.builder().horsePower(100)
                                        .engineCapacity(1400)
                                        .appComponent(((DaggerApp) getApplication()).getComponent())
                                        .build();

        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
