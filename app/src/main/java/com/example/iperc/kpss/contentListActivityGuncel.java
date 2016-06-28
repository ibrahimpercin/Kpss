package com.example.iperc.kpss;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class contentListActivityGuncel extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list_activity_guncel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView5);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " İçerik Görüntülendi",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " İçerik Gizlendi",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                final String selected = (String) listAdapter.getChild(groupPosition, childPosition);
                Intent intent;
                //Seçime göre açılma ve içeriği güncelleme
                switch(selected){
                    case "Unesco’nun Dünya Mirası Listesindeki Doğal Ve Kültürel Varlıklarımız":
                        intent = new Intent(contentListActivityGuncel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.unesco_dunya));
                        intent.putExtra("icerik2",getString(R.string.unesco_dunya_title));
                        startActivity(intent);
                        break;
                    case "Bazı Önemli Projeler":
                        intent = new Intent(contentListActivityGuncel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.bazi_onemli));
                        intent.putExtra("icerik2",getString(R.string.bazi_onemli_title));
                        startActivity(intent);
                        break;
                    case "50. Uluslararası Antalya Altın Portakal Film Festivali Ödülleri":
                        intent = new Intent(contentListActivityGuncel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.antalya));
                        intent.putExtra("icerik2",getString(R.string.antalya_title));
                        startActivity(intent);
                        break;
                    case "Önemli Güncel Olaylar":
                        intent = new Intent(contentListActivityGuncel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.onemliguncel));
                        intent.putExtra("icerik2",getString(R.string.onemliguncel_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’ye Vize Uygulamayan Ülkeler":
                        intent = new Intent(contentListActivityGuncel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vize_uygulayan));
                        intent.putExtra("icerik2",getString(R.string.vize_uygulayan_title));
                        startActivity(intent);
                        break;
                    case "Ulusal Gelişmeler":
                        intent = new Intent(contentListActivityGuncel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.ulusal_gelismeler));
                        intent.putExtra("icerik2",getString(R.string.ulusal_gelismeler_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’nin Stratejik Vizyonu 2023":
                        intent = new Intent(contentListActivityGuncel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.statejik_vizyon));
                        intent.putExtra("icerik2",getString(R.string.statejik_vizyon_title));
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });;
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Güncel Bilgiler 2016");


        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("Unesco’nun Dünya Mirası Listesindeki Doğal Ve Kültürel Varlıklarımız");
        top250.add("Bazı Önemli Projeler");
        top250.add("50. Uluslararası Antalya Altın Portakal Film Festivali Ödülleri");
        top250.add("Önemli Güncel Olaylar");
        top250.add("Türkiye’ye Vize Uygulamayan Ülkeler");
        top250.add("Türkiye’nin Stratejik Vizyonu 2023");
        top250.add("Ulusal Gelişmeler");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data

    }
    public class MainApplication extends Application {
        @Override
        public void onCreate() {
            super.onCreate();

            //set Custom Typeface
            FontsOverride.setDefaultFont(this, "MONOSPACE", "Ubuntu-L.ttf");
        }
    }

}
