package com.example.iperc.kpss;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class icerikViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icerik_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Gelen içeriği ekleme
        Intent intent = getIntent();
        TextView textContent =(TextView) findViewById(R.id.textView2);
        Bundle extras = getIntent().getExtras();
        String editTextVal= extras.getString("icerik");
        String editTextVal2= extras.getString("icerik2");
        textContent.setText(editTextVal);
        Typeface fontRalewayLight = Typeface.createFromAsset(getAssets(),"fonts/Raleway-Light.ttf");
        Typeface fontRobotoLight = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Light.ttf");
        Typeface fontOxygenLight = Typeface.createFromAsset(getAssets(),"fonts/Oxygen-Light.ttf");
        Typeface fontOxygenRegular = Typeface.createFromAsset(getAssets(),"fonts/Oxygen-Regular.ttf");
        textContent.setTypeface(fontOxygenRegular);
        setTitle(extras.getString("icerik2"));
        //Floating Button Arkaplan değişimi ve Bildirim yazısısı
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            boolean favSelected = false;
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                if (!favSelected) {
                    Snackbar.make(view, "Çalıştıklarıma Eklendi", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                } else if (favSelected) {
                    Snackbar.make(view, "Çalıştıklarımdan Silindi", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }

                if (!favSelected) {
                    favSelected = true;
                    view.setBackgroundTintList(new ColorStateList(new int[][]
                            {new int[]{0}}, new int[]{getResources().getColor(R.color.yesil)}));
                } else if (favSelected) {
                    favSelected = false;
                    view.setBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{getResources().getColor(R.color.colorAccent)}));
                }
            }
        });

    }
}
