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

public class contentListActivityTarih extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list_activity_tarih);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView6);

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
                    case "İslamiyet Öncesi Türk tarihi":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_islamiyet_oncesi));
                        intent.putExtra("icerik2",getString(R.string.tarih_islamiyet_oncesi_title));
                        startActivity(intent);
                        break;
                    case "İlk Türk Devletleri":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_ilkturk_devletleri));
                        intent.putExtra("icerik2",getString(R.string.tarih_ilkturk_devletleri_title));
                        startActivity(intent);
                        break;
                    case "İslamiyet Öncesi Türk Devletleri Kültür ve Medeniyeti":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_islamiyet_oncesi));
                        intent.putExtra("icerik2",getString(R.string.tarih_islamiyet_oncesi_title));
                        startActivity(intent);
                        break;
                    case "ilk Türk İslam Devletleri":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_islam_devletleri));
                        intent.putExtra("icerik2",getString(R.string.tarih_islam_devletleri_title));
                        startActivity(intent);
                        break;
                    case "Selçuklu Devleti Kültür ve Medeniyeti":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_anadolu_selculu_kultur));
                        intent.putExtra("icerik2",getString(R.string.tarih_anadolu_selculu_kultur_title));
                        startActivity(intent);
                        break;
                    case "Orta Asya Türk Devletleri":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_orta_asya));
                        intent.putExtra("icerik2",getString(R.string.tarih_orta_asya_title));
                        startActivity(intent);
                        break;
                    case "Türk Beylikleri":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_turk_beylikleri));
                        intent.putExtra("icerik2",getString(R.string.tarih_turk_beylikleri_title));
                        startActivity(intent);
                    case "Anadolu Selçuklu Devleti":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_anadolu_selcuklu));
                        intent.putExtra("icerik2",getString(R.string.tarih_selcuklu_title));
                        startActivity(intent);
                        break;
                    case "Anadolu Türk Beylikleri":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_turk_beylikleri));
                        intent.putExtra("icerik2",getString(R.string.tarih_turk_beylikleri_title));
                        startActivity(intent);
                        break;
                    case "Anadolu Selçuklu Devleti Kültür ve Medeniyeti":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_anadolu_selculu_kultur));
                        intent.putExtra("icerik2",getString(R.string.tarih_anadolu_selculu_kultur_title));
                        startActivity(intent);
                        break;
                    case "Osmanlı İmparatorluğu Kültür ve Medeniyeti – 1":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_osmanlı_kultur1));
                        intent.putExtra("icerik2",getString(R.string.tarih_osmanlı_kultur1_title));
                        startActivity(intent);
                        break;
                    case "Osmanlı İmparatorluğu Kültür ve Medeniyeti – 2":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_osmanlı_kultur2));
                        intent.putExtra("icerik2",getString(R.string.tarih_osmanlı_kultur2_title));
                        startActivity(intent);
                        break;
                    case "Osmanlı İmparatorluğu Kültür ve Medeniyeti – 3":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_osmanlı_kultur3));
                        intent.putExtra("icerik2",getString(R.string.tarih_osmanlı_kultur3_title));
                        startActivity(intent);
                        break;
                    case "Osmanlı İmparatorluğu Kültür ve Medeniyeti – 4":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_osmanlı_kultur4));
                        intent.putExtra("icerik2",getString(R.string.tarih_osmanlı_kultur4_title));
                        startActivity(intent);
                        break;
                    case "Osmanlı İmparatorluğu Kültür ve Medeniyeti – 5":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_osmanlı_kultur5));
                        intent.putExtra("icerik2",getString(R.string.tarih_osmanlı_kultur5_title));
                        startActivity(intent);
                    case "Osmanlı İmparatorluğu Kültür ve Medeniyeti – 6":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_osmanlı_kultur6));
                        intent.putExtra("icerik2",getString(R.string.tarih_osmanlı_kultur6_title));
                        startActivity(intent);
                        break;
                    case "Beylikten Devlete Osmanlı (1300-1453)":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_beylikten_osmanlı));
                        intent.putExtra("icerik2",getString(R.string.tarih_beylikten_osmanlı_title));
                        startActivity(intent);
                        break;
                    case "İstanbul’un Fethi 1453":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_istanbul_fatih));
                        intent.putExtra("icerik2",getString(R.string.tarih_istanbul_fatih_title));
                        startActivity(intent);
                        break;
                    case "Osmanlı Yükselme Dönemi (1453-1600)":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_osmanlı_yukselis));
                        intent.putExtra("icerik2",getString(R.string.tarih_osmanlı_yukselis_title));
                        startActivity(intent);
                        break;
                    case "Osmanlı Duraklama Dönemi":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_osmanli_duraklama));
                        intent.putExtra("icerik2",getString(R.string.tarih_osmanli_duraklama_title));
                        startActivity(intent);
                        break;
                    case "Duraklama Dönemi Dış Nedenleri":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_osmanli_duraklama2));
                        intent.putExtra("icerik2",getString(R.string.tarih_osmanli_duraklama2_title));
                        startActivity(intent);
                    case "17. Yüzyıl İsyanları":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_isyanlar));
                        intent.putExtra("icerik2",getString(R.string.tarih_isyanlar_title));
                        startActivity(intent);
                        break;
                    case "18. Yüzyıl Islahatları":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_islihatlar));
                        intent.putExtra("icerik2",getString(R.string.tarih_islihatlar_title));
                        startActivity(intent);
                        break;
                    case "19. Yüzyıl Siyasi Olayları":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_siyasi_olaylar));
                        intent.putExtra("icerik2",getString(R.string.tarih_siyasi_olaylar_title));
                        startActivity(intent);
                        break;
                    case "Osmanlı Rus Savaşı (1877-1878)":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_osmanli_rus));
                        intent.putExtra("icerik2",getString(R.string.tarih_osmanli_rus));
                        startActivity(intent);
                        break;
                    case "I. Meşrutiyet":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_mesrutiyet));
                        intent.putExtra("icerik2",getString(R.string.tarih_mesrutiyet_title));
                        startActivity(intent);
                        break;
                    case "II. Meşrutiyet":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_mesrutiyet2));
                        intent.putExtra("icerik2",getString(R.string.tarih_mesrutiyet2_title));
                        startActivity(intent);
                        break;
                    case "31 Mart Olayı":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_31Mart));
                        intent.putExtra("icerik2",getString(R.string.tarih_31Mart_title));
                        startActivity(intent);
                        break;
                    case "Osmanlı Fikir Akımları":
                        intent = new Intent(contentListActivityTarih.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.tarih_fikir_akimlari));
                        intent.putExtra("icerik2",getString(R.string.tarih_fikir_akimlari_title));
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });
    }

    
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("İslamiyet Öncesi Türk tarihi");
        listDataHeader.add("İslam Devletleri");
        listDataHeader.add("Osmanlı Tarihi");

        // Adding child data
        List<String> islamiyet_once = new ArrayList<String>();
        islamiyet_once.add("İslamiyet Öncesi Türk Tarihi");
        islamiyet_once.add("İlk Türk Devletleri");
        islamiyet_once.add("İslamiyet Öncesi Türk Devletleri Kültür ve Medeniyeti");

        List<String> islam_dev = new ArrayList<String>();
        islam_dev.add("ilk Türk İslam Devletleri");
        islam_dev.add("Selçuklu Devleti Kültür ve Medeniyeti");
        islam_dev.add("Orta Asya Türk Devletleri");
        islam_dev.add("Türk Beylikleri");
        islam_dev.add("Anadolu Selçuklu Devleti");
        islam_dev.add("Anadolu Türk Beylikleri");
        islam_dev.add("Anadolu Selçuklu Devleti Kültür ve Medeniyeti");

        List<String> osmanli_dev = new ArrayList<String>();
        osmanli_dev.add("Osmanlı İmparatorluğu Kültür ve Medeniyeti – 1");
        osmanli_dev.add("Osmanlı İmparatorluğu Kültür ve Medeniyeti – 2");
        osmanli_dev.add("Osmanlı İmparatorluğu Kültür ve Medeniyeti – 3");
        osmanli_dev.add("Osmanlı İmparatorluğu Kültür ve Medeniyeti – 4");
        osmanli_dev.add("Osmanlı İmparatorluğu Kültür ve Medeniyeti – 5");
        osmanli_dev.add("Osmanlı İmparatorluğu Kültür ve Medeniyeti – 6");
        osmanli_dev.add("Beylikten Devlete Osmanlı (1300-1453)");
        osmanli_dev.add("İstanbul’un Fethi 1453");
        osmanli_dev.add("Osmanlı Yükselme Dönemi (1453-1600)");
        osmanli_dev.add("Osmanlı Duraklama Dönemi");
        osmanli_dev.add("Duraklama Dönemi Dış Nedenleri");
        osmanli_dev.add("17. Yüzyıl İsyanları");
        osmanli_dev.add("18. Yüzyıl Islahatları");
        osmanli_dev.add("19. Yüzyıl Siyasi Olayları");
        osmanli_dev.add("Osmanlı Rus Savaşı (1877-1878)");
        osmanli_dev.add("I. Meşrutiyet");
        osmanli_dev.add("II. Meşrutiyet");
        osmanli_dev.add("31 Mart Olayı");
        osmanli_dev.add("Osmanlı Fikir Akımları");
        
        listDataChild.put(listDataHeader.get(0), islamiyet_once); // Header, Child data
        listDataChild.put(listDataHeader.get(1), islam_dev);
        listDataChild.put(listDataHeader.get(2), osmanli_dev);
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
