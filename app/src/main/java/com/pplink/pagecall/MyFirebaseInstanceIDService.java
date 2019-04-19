package com.pplink.pagecall;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        Log.d("MyFCM", "FCM token: " + FirebaseInstanceId.getInstance().getToken());
    }
}