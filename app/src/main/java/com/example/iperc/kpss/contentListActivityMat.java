package com.example.iperc.kpss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.TextView;
import android.widget.Toast;

import com.ExpandableListAdapter;
import com.example.iperc.kpss.FontsOverride;
import com.example.iperc.kpss.R;

public class contentListActivityMat extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {

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
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " İçerik Görüntülendi",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " İçerik Gizlendi",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
            final String selected = (String) listAdapter.getChild(groupPosition, childPosition);
            Intent intent;
                //Seçime göre açılma ve içeriği güncelleme
            switch(selected){
                case "Temel Bilgi ve İşlem Yeteneği":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_temel_bilgiler1));
                    intent.putExtra("icerik2",getString(R.string.mat_temel_bilgiler1_title));
                    startActivity(intent);
                    break;
                case "Kpss Matematik Temel Bilgiler":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_temel_bilgiler2));
                    intent.putExtra("icerik2",getString(R.string.mat_temel_bilgiler2_title));
                    startActivity(intent);
                    break;
                case "Tam Sayılar ve Sayı Çeşitleri":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_tam_sayilar));
                    intent.putExtra("icerik2",getString(R.string.mat_tam_sayilar_title));
                    startActivity(intent);
                    break;
                case "Asal Sayılar":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_asal_sayilar));
                    intent.putExtra("icerik2",getString(R.string.mat_asal_sayilar_title));
                    startActivity(intent);
                    break;
                case "Ardışık Sayılar ve Aritmetik Dizi Toplamı":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_ardisik_sayilar));
                    intent.putExtra("icerik2",getString(R.string.mat_ardisik_sayilar_title));
                    startActivity(intent);
                    break;
                case "Faktöriyel":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_faktoriyel));
                    intent.putExtra("icerik2",getString(R.string.mat_faktoriyel_title));
                    startActivity(intent);
                    break;
                case "Sayı Sistemleri – Basamak Değeri":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_sayi_sistemleri));
                    intent.putExtra("icerik2",getString(R.string.mat_sayi_sistemleri_title));
                    startActivity(intent);
                    break;
                case "Taban Aritmetiği":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_taban_aritmetigi));
                    intent.putExtra("icerik2",getString(R.string.mat_taban_aritmetigi_title));
                    startActivity(intent);
                    break;
                case "Bölme İşlemi – Bölen Kalan İlişkisi":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_bolme_islemi));
                    intent.putExtra("icerik2",getString(R.string.mat_bolme_islemi_title));
                    startActivity(intent);
                    break;
                case "Bölünebilme Kuralları":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_bolunebilme_kurallari));
                    intent.putExtra("icerik2",getString(R.string.mat_bolunebilme_kurallari_title));
                    startActivity(intent);
                    break;
                case "Asal Çarpanlara Ayırma":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_asal_carpanlar));
                    intent.putExtra("icerik2",getString(R.string.mat_asal_carpanlar_title));
                    startActivity(intent);
                    break;
                case "OBEB – OKEK":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_obeb_okek));
                    intent.putExtra("icerik2",getString(R.string.mat_obeb_okek_title));
                    startActivity(intent);
                    break;
                case "Rasyonel Sayılar":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_rasyonel_sayilar));
                    intent.putExtra("icerik2",getString(R.string.mat_rasyonel_sayilar_title));
                    startActivity(intent);
                    break;
                case "Rasyonel Sayılarda Dört İşlem":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_rasynel_sayilarda_islem));
                    intent.putExtra("icerik2",getString(R.string.mat_rasynel_sayilarda_dortislem_title));
                    startActivity(intent);
                    break;
                case "Basit Eşitsizlikler":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_basit_esitsizlikler));
                    intent.putExtra("icerik2",getString(R.string.mat_basit_esitsizlikler_title));
                    startActivity(intent);
                    break;
                case "Mutlak Değer":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_mutlak_deger));
                    intent.putExtra("icerik2",getString(R.string.mat_mutlak_deger_title));
                    startActivity(intent);
                    break;
                case "Üslü Sayılar":
                    intent = new Intent(contentListActivityMat.this, icerikViewActivity.class);
                    intent.putExtra("icerik",getString(R.string.mat_uslu_sayilar));
                    intent.putExtra("icerik2",getString(R.string.mat_uslu_sayilar_title));
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
        listDataHeader.add("Temel Kavramlar");
        listDataHeader.add("Fonksiyonel Kavramlar");

        // Adding child data
        List<String> temel = new ArrayList<String>();
        temel.add("Temel Bilgi ve İşlem Yeteneği");
        temel.add("Kpss Matematik Temel Bilgiler");
        temel.add("Tam Sayılar ve Sayı Çeşitleri");
        temel.add("Asal Sayılar");
        temel.add("Ardışık Sayılar ve Aritmetik Dizi Toplamı");

        List<String> fonk = new ArrayList<String>();
        fonk.add("Faktöriyel");
        fonk.add("Sayı Sistemleri – Basamak Değeri");
        fonk.add("Taban Aritmetiği");
        fonk.add("Bölme İşlemi – Bölen Kalan İlişkisi");
        fonk.add("Bölünebilme Kuralları");
        fonk.add("Asal Çarpanlara Ayırma");
        fonk.add("OBEB – OKEK");
        fonk.add("Rasyonel Sayılar");
        fonk.add("Rasyonel Sayılarda Sıralama");
        fonk.add("Basit Eşitsizlikler");
        fonk.add("Mutlak Değer");
        fonk.add("Üslü Sayılar");



        listDataChild.put(listDataHeader.get(0), temel); // Header, Child data
        listDataChild.put(listDataHeader.get(1), fonk);

    }
    public class MainApplication extends Application {
        @Override
        public void onCreate() {
            super.onCreate();

            //set Custom Typeface
            FontsOverride.setDefaultFont(this, "MONOSPACE", "Oxygen-Light.ttf");
        }
    }
    }

