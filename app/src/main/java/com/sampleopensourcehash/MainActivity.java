package com.sampleopensourcehash;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.opensourcehash.OpenHashListeners.OpenDataHashCallbacks;
import com.opensourcehash.OpendataHashApp;

public class MainActivity extends AppCompatActivity implements OpenDataHashCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Replace with your keys
        OpendataHashApp.initialize(MainActivity.this, "YOUR_API_KEY", "USER_EMAIL", "USER_GOOGLE_ADVERTISER_ID");
    }

    //Callback methods
    @Override
    public void onDataSuccess(String message, String data) {
        Log.i("onDataSuccess", "" + data);

    }

    @SuppressLint("WrongConstant")
    @Override
    public void onDataFailure(String message) {
        Log.i("onDataFailure", "" + message);
    }
}