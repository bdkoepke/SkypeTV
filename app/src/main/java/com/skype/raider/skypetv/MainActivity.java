package com.skype.raider.skypetv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.PersistableBundle;

public class MainActivity extends Activity {
    private static void openApp(final Context context, final String packageName) {
        final PackageManager manager = context.getPackageManager();
        final Intent intent = manager.getLaunchIntentForPackage(packageName);
        if (intent != null) {
            intent.addCategory(Intent.CATEGORY_LAUNCHER);
            context.startActivity(intent);
        }
    }

    public MainActivity() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        openApp(this, "com.skype.raider");
        this.finish();
    }
}
