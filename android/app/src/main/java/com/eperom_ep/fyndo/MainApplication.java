package com.eperom_ep.fyndo;

import android.app.Application;
import com.onesignal.OneSignal;

public class MainApplication extends Application {
    private static final String ONESIGNAL_APP_ID = "0023ca96-626c-418c-bab3-0a25090c055c";

    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.initWithContext(this, ONESIGNAL_APP_ID);
    }
}
