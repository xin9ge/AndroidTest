package com.example.yx.aarlibrary;

import android.content.Context;

public class Dispatcher {
    private static class SingletonHolder {
        private static final Dispatcher INSTANCE = new Dispatcher();
    }
    private Dispatcher() {
    }
    public static final Dispatcher getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public String getString(Context context){
       return context.getString(R.string.test);
    }
}
