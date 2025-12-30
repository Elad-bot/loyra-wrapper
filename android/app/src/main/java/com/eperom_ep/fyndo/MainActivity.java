package com.eperom_ep.fyndo;

import android.os.Build;
import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Android 13+ requires explicit POST_NOTIFICATIONS permission
    if (Build.VERSION.SDK_INT >= 33) {
      requestPermissions(new String[]{android.Manifest.permission.POST_NOTIFICATIONS}, 1001);
    }
  }
}
