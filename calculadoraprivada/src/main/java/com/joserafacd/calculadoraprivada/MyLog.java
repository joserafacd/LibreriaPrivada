package com.joserafacd.calculadoraprivada;

import android.content.Context;
import android.content.pm.PackageManager;
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

    public static String versionName(Context context){
        String versionName = null;
        try {
            versionName = context.getPackageManager().getPackageInfo("com.joserafacd.libreriaprivada", 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "undefined";
        }
        return versionName;
    }
}
