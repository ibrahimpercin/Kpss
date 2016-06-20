package com.example.iperc.kpss;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button button  = (Button) findViewById(R.id.button);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);

        //Matematik Butonu
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,contentListActivityMat.class));
            }
        });
        //Coğrafya Butonu
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,contentListActivityCog.class));
            }
        });
        //Türkçe Butonu
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,contentListActivityTurk.class));
            }
        });
        //Güncel Bilgiler Butonu
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,contentListActivityGenel.class));
            }
        });
        //Genel Kültür Butonu
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,contentListActivityGuncel.class));
            }
        });
        //Tarih Butonu
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,contentListActivityTarih.class));
            }
        });
        //Navigation drawer kodları
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    //NavigationDraver yazı tipi
    public class MainApplication extends Application {
        @Override
        public void onCreate() {
            super.onCreate();

            //set Custom Typeface
            FontsOverride.setDefaultFont(this, "MONOSPACE", "Ubuntu-L.ttf");
        }
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

        } else if (id == R.id.nav_statistic) {

        } else if (id == R.id.nav_math) {
            startActivity(new Intent(MainActivity.this,contentListActivityMat.class));
        } else if (id == R.id.nav_geography) {
            startActivity(new Intent(MainActivity.this,contentListActivityCog.class));
        } else if (id == R.id.nav_turkish) {
            startActivity(new Intent(MainActivity.this,contentListActivityTurk.class));
        } else if (id == R.id.nav_current) {
            startActivity(new Intent(MainActivity.this,contentListActivityGuncel.class));
        } else if (id == R.id.nav_general) {
            startActivity(new Intent(MainActivity.this,contentListActivityGenel.class));
        } else if (id == R.id.nav_history) {
            startActivity(new Intent(MainActivity.this,contentListActivityTarih.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
        }



}
