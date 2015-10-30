package com.diagoalley.android.notificationtest;

import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by admin on 2015/10/30.
 */
public class NotificationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_layout);
        NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManager.cancel(1);
    }
}
