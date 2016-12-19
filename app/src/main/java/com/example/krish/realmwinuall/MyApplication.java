package com.example.krish.realmwinuall;

/**
 * Created by krish on 12/19/2016.
 */

import android.app.Application;


import android.app.Application;
import io.realm.Realm;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize Realm. Should only be done once when the application starts.
        Realm.init(this);
    }
}
