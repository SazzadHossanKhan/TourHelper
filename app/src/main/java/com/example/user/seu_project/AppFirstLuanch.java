package com.example.user.seu_project;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class AppFirstLuanch extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

    }
}
