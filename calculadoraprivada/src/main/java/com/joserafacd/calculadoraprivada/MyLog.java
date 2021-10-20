package com.joserafacd.calculadoraprivada;

import android.util.Log;

public class MyLog {
    public static void d(String TAG, String message){
        Log.d(TAG, message);
    }

    public static void v(String message){
        Log.v("Prueba",message);
    }

    public static void i(String message){
        Log.i("Hola", message);
    }
}
