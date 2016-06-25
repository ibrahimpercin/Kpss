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

public class contentListActivityGenel extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list_activity_genel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView4);

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
                    case "Temel Hukuk Bilgileri":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_temel_hukuk));
                        intent.putExtra("icerik2",getString(R.string.vtd_temel_hukuk_title));
                        startActivity(intent);
                        break;
                    case "Kamu Hukuku – Hukukun Dalları":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_hukuk_dallari));
                        intent.putExtra("icerik2",getString(R.string.vtd_hukuk_dallari_title));
                        startActivity(intent);
                        break;
                    case "Özel Hukuk ve Karma Hukuk – Hukukun Alt Dalları":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_hukuk_dallari2));
                        intent.putExtra("icerik2",getString(R.string.vtd_hukuk_dallari2_title));
                        startActivity(intent);
                        break;
                    case "Normlar Hiyerarşisi":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_normlar));
                        intent.putExtra("icerik2",getString(R.string.vtd_normlar_title));
                        startActivity(intent);
                        break;
                    case "Yaptırım Türleri":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_yaptitirim));
                        intent.putExtra("icerik2",getString(R.string.vtd_yaptitirim_title));
                        startActivity(intent);
                        break;
                    case "Hak Kavramı ve Hakların Korunması":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_hak_kavrami));
                        intent.putExtra("icerik2",getString(R.string.vtd_hak_kavrami_title));
                        startActivity(intent);
                        break;
                    case "Kamu Hakları ve Özel Haklar":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_kamu_haklari));
                        intent.putExtra("icerik2",getString(R.string.vtd_kamu_haklari_title));
                        startActivity(intent);
                        break;
                    case "Devlet Sistemleri":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_devlet_sistemi));
                        intent.putExtra("icerik2",getString(R.string.vtd_devlet_sistemi_title));
                        startActivity(intent);
                        break;
                    case "Demokrasi ve Demokrasi Çeşitleri":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_demokrasi));
                        intent.putExtra("icerik2",getString(R.string.vtd_demokrasi_title));
                        startActivity(intent);
                        break;
                    case "Hükümet Sistemleri":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_demokrasi_sistemleri));
                        intent.putExtra("icerik2",getString(R.string.vtd_demokrasi_sistemleri_title));
                        startActivity(intent);
                        break;
                    case "Anayasa Hukuku":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_anayasa_hukuku));
                        intent.putExtra("icerik2",getString(R.string.vtd_anayasa_hukuku));
                        startActivity(intent);
                        break;
                    case "1921 Anayasası":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_21Anayasasi));
                        intent.putExtra("icerik2",getString(R.string.vtd_21Anayasasi_title));
                        startActivity(intent);
                        break;
                    case "1961 Anayasası":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_61Anayasasi));
                        intent.putExtra("icerik2",getString(R.string.vtd_61Anayasasi_title));
                        startActivity(intent);
                        break;
                    case "1982 Anayasası":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_82Anayasasi));
                        intent.putExtra("icerik2",getString(R.string.vtd_82Anayasasi_title));
                        startActivity(intent);
                        break;
                    case "Temel Hak ve Ödevler":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_temel_haklar));
                        intent.putExtra("icerik2",getString(R.string.vtd_temel_haklar_title));
                        startActivity(intent);
                        break;
                    case "Kişinin Hakları ve Ödevleri":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_kisi_haklari));
                        intent.putExtra("icerik2",getString(R.string.vtd_kisi_haklari_title));
                        startActivity(intent);
                        break;
                    case "Özel Hayatın Gizliliği, Seyahat, Din ve Vicdan Hürriyeti":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_kisi_haklari2));
                        intent.putExtra("icerik2",getString(R.string.vtd_kisi_haklari2_title));
                        startActivity(intent);
                        break;
                    case "Düşünceyi Açıklama , Yayma ve Kanaat Hürriyeti":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_kisi_haklari3));
                        intent.putExtra("icerik2",getString(R.string.vtd_kisi_haklari3_title));
                        startActivity(intent);
                        break;
                    case "Toplantı, Mülkiyet ve İspat Hakkı | Hakların Korunması":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_kisi_haklari4));
                        intent.putExtra("icerik2",getString(R.string.vtd_kisi_haklari4_title));
                        startActivity(intent);
                        break;
                    case "Sosyal ve Ekonomik Haklar":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_sosyal_haklar));
                        intent.putExtra("icerik2",getString(R.string.vtd_sosyal_haklar_title));
                        startActivity(intent);
                        break;
                    case "Çalışma ve Sözleşme Hürriyeti":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_calsma_sozlesmesi));
                        intent.putExtra("icerik2",getString(R.string.vtd_calsma_sozlesmesi_title));
                        startActivity(intent);
                        break;
                    case "Diğer Hak ve Ödevler":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_diger_haklar));
                        intent.putExtra("icerik2",getString(R.string.vtd_diger_haklar_title));
                        startActivity(intent);
                        break;
                    case "Siyasi Hak ve Ödevler":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_siyasi_haklar));
                        intent.putExtra("icerik2",getString(R.string.vtd_siyasi_haklar_title));
                        startActivity(intent);
                        break;
                    case "Yasama":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_yasama));
                        intent.putExtra("icerik2",getString(R.string.vtd_yasama_title));
                        startActivity(intent);
                        break;
                    case "TBMM’nin Çalışma Düzeni":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_tbmm_calısma));
                        intent.putExtra("icerik2",getString(R.string.vtd_tbmm_calısma_title));
                        startActivity(intent);
                        break;
                    case "TBMM’de Oylama Türleri":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_tbmm_oylama));
                        intent.putExtra("icerik2",getString(R.string.vtd_tbmm_oylama_title));
                        startActivity(intent);
                        break;
                    case "TBMM’nin Görev ve Yetkileri":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_tbmm_gorev));
                        intent.putExtra("icerik2",getString(R.string.vtd_tbmm_gorev_title));
                        startActivity(intent);
                        break;
                    case "TBMM Başkanlık Divanı":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_tbmm_baskanlik));
                        intent.putExtra("icerik2",getString(R.string.vtd_tbmm_baskanlik_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’de Seçim":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_tbmm_secim));
                        intent.putExtra("icerik2",getString(R.string.vtd_tbmm_secim_title));
                        startActivity(intent);
                        break;
                    case "Seçim İlkeleri":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.vtd_secim_ilkeri));
                        intent.putExtra("icerik2",getString(R.string.vtd_secim_ilkeri_title));
                        startActivity(intent);
                        break;
                    case "Birleşmiş Milletler (BM)":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.guncel_bm));
                        intent.putExtra("icerik2",getString(R.string.guncel_bm_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’nin Üye Olduğu Uluslararası Kuruluşlar":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.guncel_kuruluslar));
                        intent.putExtra("icerik2",getString(R.string.guncel_kuruluslar_title));
                        startActivity(intent);
                        break;
                    case "Avrupa Birliği ve Türkiye İlişkileri":
                        intent = new Intent(contentListActivityGenel.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.guncel_ab));
                        intent.putExtra("icerik2",getString(R.string.guncel_ab_title));
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Temel Hukuk Bilgileri");
        listDataHeader.add("Devlet Sistemleri");
        listDataHeader.add("Haklar ve Ödevler");
        listDataHeader.add("Anayasalar");
        listDataHeader.add("Devletin Çalışma Düzeni");
        
        // Adding child data
        List<String> temel_hukuk = new ArrayList<String>();
        temel_hukuk.add("Temel Hukuk Bilgileri");
        temel_hukuk.add("Kamu Hukuku – Hukukun Dalları");
        temel_hukuk.add("Özel Hukuk ve Karma Hukuk – Hukukun Alt Dalları");
        temel_hukuk.add("Normlar Hiyerarşisi");
        temel_hukuk.add("Yaptırım Türleri");
        temel_hukuk.add("Hak Kavramı ve Hakların Korunması");
        temel_hukuk.add("Kamu Hakları ve Özel Haklar");

        List<String> devlet_sis = new ArrayList<String>();
        devlet_sis.add("Devlet Sistemleri");
        devlet_sis.add("Demokrasi ve Demokrasi Çeşitleri");
        devlet_sis.add("Hükümet Sistemleri");

        List<String> anayasa = new ArrayList<String>();
        anayasa.add("Anayasa Hukuku");
        anayasa.add("1921 Anayasası");
        anayasa.add("1961 Anayasası");
        anayasa.add("1982 Anayasası");

        List<String> hak_odev = new ArrayList<String>();
        hak_odev.add("Temel Hak ve Ödevler");
        hak_odev.add("Kişinin Hakları ve Ödevleri");
        hak_odev.add("Özel Hayatın Gizliliği, Seyahat, Din ve Vicdan Hürriyeti");
        hak_odev.add("Düşünceyi Açıklama , Yayma ve Kanaat Hürriyeti");
        hak_odev.add("Toplantı, Mülkiyet ve İspat Hakkı | Hakların Korunması");
        hak_odev.add("Sosyal ve Ekonomik Haklar");
        hak_odev.add("Çalışma ve Sözleşme Hürriyeti");
        hak_odev.add("Diğer Hak ve Ödevler");
        hak_odev.add("Siyasi Hak ve Ödevler");

        List<String> calisma_dzn = new ArrayList<String>();
        calisma_dzn.add("Yasama");
        calisma_dzn.add("TBMM’nin Çalışma Düzeni");
        calisma_dzn.add("TBMM’de Oylama Türleri");
        calisma_dzn.add("TBMM’nin Görev ve Yetkileri");
        calisma_dzn.add("TBMM Başkanlık Divanı");
        calisma_dzn.add("Türkiye’de Seçim");
        calisma_dzn.add("Seçim İlkeleri");
        calisma_dzn.add("Birleşmiş Milletler (BM)");
        calisma_dzn.add("Türkiye’nin Üye Olduğu Uluslararası Kuruluşlar");
        calisma_dzn.add("Avrupa Birliği ve Türkiye İlişkileri");
       
        listDataChild.put(listDataHeader.get(0), temel_hukuk); // Header, Child data
        listDataChild.put(listDataHeader.get(1), anayasa);
        listDataChild.put(listDataHeader.get(2), devlet_sis);
        listDataChild.put(listDataHeader.get(3), hak_odev);
        listDataChild.put(listDataHeader.get(4), calisma_dzn);
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
