package com.houjianbo.mycrashexceptionhandler;

import android.app.Application;

/**
 * @author：houjianbo
 * @time：2017/1/13 15:15
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
