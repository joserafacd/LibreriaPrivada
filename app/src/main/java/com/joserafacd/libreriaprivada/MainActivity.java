package com.joserafacd.libreriaprivada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.joserafacd.calculadoraprivada.MyLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLog myLog = new MyLog();
        Log.d("versionName",myLog.versionName(this));
    }
}