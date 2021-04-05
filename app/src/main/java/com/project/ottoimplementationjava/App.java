package com.project.ottoimplementationjava;

import android.app.Application;

public class App extends Application {
    public static final MainThreadBus mMainThreadBus = new MainThreadBus();
    public static App app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

    public static MainThreadBus getMainThreadBusInstance() {
        return mMainThreadBus;
    }
}
