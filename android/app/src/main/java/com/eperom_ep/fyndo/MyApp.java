package com.eperom_ep.fyndo;

import android.app.Application;
import com.onesignal.OneSignal;

public class MyApp extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    // Replace with your real OneSignal App ID (UUID)
    OneSignal.initWithContext(this, "0023ca96-626c-418c-bab3-0a25090c055c");
  }
}
