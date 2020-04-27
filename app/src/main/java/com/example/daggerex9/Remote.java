package com.example.daggerex9;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";
    
    @Inject
    public Remote() {
    }

    public void setListner(Car car){
        Log.d(TAG, "Remote Connected!!!!");
    }
}
