package com.ayckermann.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alamat(View view){
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("google.streetview:cbll=46.414382,10.013988"));
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public void telepon(View view){
        Intent telIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:085158305118"));
        telIntent.setPackage("com.google.android.apps.maps");
        startActivity(telIntent);
    }
    public void email(View view){
        Intent mailIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("google.streetview:cbll=46.414382,10.013988"));
        mailIntent.setPackage("com.google.android.apps.maps");
        startActivity(mailIntent);
    }
}