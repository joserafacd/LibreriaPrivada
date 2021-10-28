package com.joserafacd.calculadoraprivada;

import android.content.Context;
import android.content.pm.PackageInfo;
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
        PackageManager manager = context.getPackageManager();
        PackageInfo info = null;
        try {
            info = manager.getPackageInfo(context.getPackageName(), PackageManager.GET_ACTIVITIES);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            Log.d("versionName","error");
            return "Undefined";
        }
        return info.versionName;
    }
}
