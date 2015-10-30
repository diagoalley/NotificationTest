package com.diagoalley.android.notificationtest;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button sentNotice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sentNotice = (Button) findViewById(R.id.sent_notice);
        sentNotice.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.sent_notice:
                NotificationManager manager = (NotificationManager)
                        getSystemService(Context.NOTIFICATION_SERVICE);
                Notification.Builder builder = new Notification.Builder(this).setTicker("" +
                        "显示屏幕顶端的文本").setSmallIcon(R.mipmap.ic_launcher);
                Intent intent = new Intent(this,NotificationActivity.class);
                PendingIntent pi = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_CANCEL_CURRENT);
                Notification notification = builder.setContentTitle("title").setContentText(
                        "text").setContentIntent(pi).build();
                manager.notify(1,notification);
                break;
            default:
                break;
        }
    }
}
