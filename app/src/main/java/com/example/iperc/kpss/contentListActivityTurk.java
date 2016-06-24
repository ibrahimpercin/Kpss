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

public class contentListActivityTurk extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list_activity_turk);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView3);

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
                    case "Sözcükte Anlam":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_sozcukte_anlam));
                        intent.putExtra("icerik2",getString(R.string.turkce_sozcukte_anlam_title));
                        startActivity(intent);
                        break;
                    case "Sözcükte Anlam İlişkileri":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_sozcukte_anlam_iliskisi));
                        intent.putExtra("icerik2",getString(R.string.turkce_sozcukte_anlam_iliskisi_title));
                        startActivity(intent);
                        break;
                    case "Sözcükte Anlam Olayları":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_sozcukte_anlam_olayları));
                        intent.putExtra("icerik2",getString(R.string.turkce_sozcukte_anlam_olayları_title));
                        startActivity(intent);
                        break;
                    case "Atasözleri ve Deyimler | İkilemler":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_atasozleri_deyimler));
                        intent.putExtra("icerik2",getString(R.string.turkce_atasozleri_deyimler_title));
                        startActivity(intent);
                        break;
                    case "Cümlede Anlam İlişkileri":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_sozcukte_anlam));
                        intent.putExtra("icerik2",getString(R.string.turkce_sozcukte_anlam_title));
                        startActivity(intent);
                    case "Cümlede Anlam İlişkileri – 2":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_cumlede_anlam));
                        intent.putExtra("icerik2",getString(R.string.turkce_cumlede_anlam_title));
                        startActivity(intent);
                        break;
                    case "Cümlede Anlatım Özellikleri":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_cumlede_anlam2));
                        intent.putExtra("icerik2",getString(R.string.turkce_cumlede_anlam2_title));
                        startActivity(intent);
                        break;
                    case "Anlatım Biçimleri":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_anlatim_bicimleri));
                        intent.putExtra("icerik2",getString(R.string.turkce_anlatim_bicimleri_title));
                        startActivity(intent);
                        break;
                    case "Düşünceyi Geliştirme Yolları":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_dusunceyi_gelistirme_yollari));
                        intent.putExtra("icerik2",getString(R.string.turkce_dusunceyi_gelistirme_yollari_title));
                        startActivity(intent);
                        break;
                    case "Paragrafta Anlatım Özellikleri":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_paragrafta_anlatim_ozellikleri));
                        intent.putExtra("icerik2",getString(R.string.turkce_paragrafta_anlatim_ozellikleri_title));
                        startActivity(intent);
                        break;
                    case "Ünlülerle İlgili Ses Olayları":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_ses_olayları));
                        intent.putExtra("icerik2",getString(R.string.turkce_ses_olayları_title));
                        startActivity(intent);
                        break;
                    case "Ünsüzlerle İlgili Ses Olayları":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_ses_olayları2));
                        intent.putExtra("icerik2",getString(R.string.turkce_ses_olayları2_title));
                        startActivity(intent);
                        break;
                    case "Ünsüz Benzeşmesi":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_unsuz_benzesmesi));
                        intent.putExtra("icerik2",getString(R.string.turkce_unsuz_benzesmesi_title));
                        startActivity(intent);
                        break;
                    case "Yazım Kuralları":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_yazim_kurallari));
                        intent.putExtra("icerik2",getString(R.string.turkce_yazim_kurallari_title));
                        startActivity(intent);
                    case "Ses Olayları Yazım Kuralları":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_yazim_kurallari2));
                        intent.putExtra("icerik2",getString(R.string.turkce_yazim_kurallari2_title));
                        startActivity(intent);
                        break;
                    case "Paragraf – Ana Düşünce – Paragraf Yapısı":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_paragrafta_anadusunce));
                        intent.putExtra("icerik2",getString(R.string.turkce_paragrafta_anadusunce_title));
                        startActivity(intent);
                        break;
                    case "Noktalama İşaretleri":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_noktalama_isaretleri));
                        intent.putExtra("icerik2",getString(R.string.turkce_noktalama_isaretleri_title));
                        startActivity(intent);
                        break;
                    case "Sözcüğün Yapısı":
                        intent = new Intent(contentListActivityTurk.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.turkce_sozcugun_yapisi));
                        intent.putExtra("icerik2",getString(R.string.turkce_sozcugun_yapisi_title));
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Anlam Bilgisi");
        listDataHeader.add("Ses Olayları");
        listDataHeader.add("Yazım Kuralları");

        // Adding child data
        List<String> anlamBilgisi = new ArrayList<String>();
        anlamBilgisi.add("Sözcükte Anlam");
        anlamBilgisi.add("Sözcükte Anlam İlişkileri");
        anlamBilgisi.add("Sözcükte Anlam Olayları");
        anlamBilgisi.add("Atasözleri ve Deyimler | İkilemler");
        anlamBilgisi.add("Cümlede Anlam İlişkileri");
        anlamBilgisi.add("Cümlede Anlam İlişkileri – 2");
        anlamBilgisi.add("Cümlede Anlatım Özellikleri");
        anlamBilgisi.add("Anlatım Biçimleri");
        anlamBilgisi.add("Düşünceyi Geliştirme Yolları");
        anlamBilgisi.add("Paragrafta Anlatım Özellikleri");
        anlamBilgisi.add("Paragraf – Ana Düşünce – Paragraf Yapısı");

        List<String> sesOlaylari = new ArrayList<String>();
        sesOlaylari.add("Ünlülerle İlgili Ses Olayları");
        sesOlaylari.add("Ünsüzlerle İlgili Ses Olayları");
        sesOlaylari.add("Ünsüz Benzeşmesi");

        List<String> yazimKurallari = new ArrayList<String>();
        yazimKurallari.add("Yazım Kuralları");
        yazimKurallari.add("Ses Olayları Yazım Kuralları");
        yazimKurallari.add("Noktalama İşaretleri");
        yazimKurallari.add("Sözcüğün Yapısı");

        listDataChild.put(listDataHeader.get(0), anlamBilgisi); // Header, Child data
        listDataChild.put(listDataHeader.get(1), sesOlaylari);
        listDataChild.put(listDataHeader.get(2), yazimKurallari);
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
