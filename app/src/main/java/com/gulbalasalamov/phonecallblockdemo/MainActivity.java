package com.gulbalasalamov.phonecallblockdemo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_ara;
    EditText edt_numara;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ara = (Button) findViewById(R.id.buttonAra);
        edt_numara = (EditText) findViewById(R.id.editTextNumara);
    }

    public void aramaYap(View view) {
        String aranacakNumara = edt_numara.getText().toString();
        Intent telefonAramasi = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + aranacakNumara));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.CALL_PHONE}, 10);
            return;
        } else {
            startActivity(telefonAramasi);
        }

    }
}
