package com.example.iperc.kpss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class icerikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icerik);
    }
    public void goTo(View view)
    {
        Intent intent = new Intent(icerikActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
