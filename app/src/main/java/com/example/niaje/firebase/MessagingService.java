package com.example.niaje.firebase;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        //this is to check the setup of the firebase message is correct
        //Log.d("FCM","Token: " + token);
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        //this is to check the setup of the firebase message is correct
        //Log.d("FCM","Message:" + remoteMessage.getNotification().getBody());
    }
}
