package com.vikcandroid.kakitu.view.main.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        synchronized (this) {
            try {
                wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
