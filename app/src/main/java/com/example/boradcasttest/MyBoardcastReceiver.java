package com.example.boradcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBoardcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"received in MyBoardcastReceiver",Toast.LENGTH_SHORT).show();
        abortBroadcast();
    }
}
