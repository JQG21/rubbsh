package com.example.dictionary;

import android.app.Application;
import android.content.Context;

public class WordsApplication extends Application {
    public static Context context;
    public static Context getContext(){
        return WordsApplication.context;
    }

    public void onCreate() {
        super.onCreate();
        WordsApplication.context=getApplicationContext();
    }
}
