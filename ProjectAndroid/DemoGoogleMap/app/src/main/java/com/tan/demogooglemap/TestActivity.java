package com.tan.demogooglemap;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.net.URI;

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

    }
    public void testIntent(){
        Intent smsintent=new Intent(Intent.ACTION_SENDTO, Uri.parse("0944926491"));
//        smsintent.setAction()
    }
    public void testNotification(){
//        Bitmap bitmap= BitmapFactory.decodeResource()
        Notification notification=new Notification.Builder(this).setContentTitle("Test").setContent("hahaha").setLargeIcon().setSmallIcon().build();
        NotificationManager manager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

    }
}
