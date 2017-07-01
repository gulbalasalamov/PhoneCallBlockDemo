package com.gulbalasalamov.phonecallblockdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class OutgoingCallsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String yapilanArama = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER).toString();
        String yasakArama = "123456";

        if (yapilanArama.contentEquals(yasakArama)) {
            setResultData(null);
            Toast.makeText(context, yasakArama + " numaralı telefonu arayamazsınız.", Toast.LENGTH_LONG).show();
        }
    }
}
