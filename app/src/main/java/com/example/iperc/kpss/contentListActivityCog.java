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

public class contentListActivityCog extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list_activity_cog);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView2);

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
                    case "Türkiyenin Matematik Konumu":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_tr_konum));
                        intent.putExtra("icerik2",getString(R.string.cografya_tr_konum_title));
                        startActivity(intent);
                        break;
                    case "Türkiyenin Matematik Konumunun Sonuçları":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cogafya_tr_konum_sonuclari));
                        intent.putExtra("icerik2",getString(R.string.cogafya_tr_konum_sonuclari_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’de Yeryüzü Şekilleri":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_yeryuzu_sekli));
                        intent.putExtra("icerik2",getString(R.string.cografya_yeryuzu_sekli_title));
                        startActivity(intent);
                        break;
                    case "Türkiye'nin Dağları":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_tr_daglar));
                        intent.putExtra("icerik2",getString(R.string.cografya_tr_daglar_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’nin Ovaları":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_tr_ovalar));
                        intent.putExtra("icerik2",getString(R.string.cografya_tr_ovalar_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’nin Platoları":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_platoalr));
                        intent.putExtra("icerik2",getString(R.string.cografya_platoalr_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’de Doğal Afetler":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_dogal_afetler));
                        intent.putExtra("icerik2",getString(R.string.cografya_dogal_afetler_title));
                        startActivity(intent);
                        break;
                    case "Türkiye'de Akarsular":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_akarsular));
                        intent.putExtra("icerik2",getString(R.string.cografya_akarsular_title));
                        startActivity(intent);
                        break;
                    case "Akarsu Rejimleri ve Debi":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_akarsular2));
                        intent.putExtra("icerik2",getString(R.string.cografya_akarsular2_title));
                        startActivity(intent);
                        break;
                    case "Türkiye'nin Yeraltı Suları":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_yeralti_sulari));
                        intent.putExtra("icerik2",getString(R.string.cografya_yeralti_sulari_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’nin Yer Şekilleri":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_yer_sekilleri));
                        intent.putExtra("icerik2",getString(R.string.cografya_yer_sekilleri_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’de Kıyı Tipleri":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_kiyi_tipleri));
                        intent.putExtra("icerik2",getString(R.string.cografya_kiyi_tipleri_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’de Göller ve Oluşumu":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_goller));
                        intent.putExtra("icerik2",getString(R.string.cografya_goller_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’nin İklimi":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_iklim));
                        intent.putExtra("icerik2",getString(R.string.cografya_iklim_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’de Basınç ve Rüzgarlar":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_basinc));
                        intent.putExtra("icerik2",getString(R.string.cografya_basinc_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’de Yağış":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_yagis));
                        intent.putExtra("icerik2",getString(R.string.cografya_yagis_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’de İklim Tipleri ve Bitki Örtüsü":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_iklim_tipleri));
                        intent.putExtra("icerik2",getString(R.string.cografya_iklim_tipleri_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’de Sıcaklık":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_sicaklik));
                        intent.putExtra("icerik2",getString(R.string.cografya_sicaklik_title));
                        startActivity(intent);
                        break;
                    case "Türkiye'de Karasal İklim":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cgrafya_karasal_iklim));
                        intent.putExtra("icerik2",getString(R.string.cgrafya_karasal_iklim_title));
                        startActivity(intent);
                        break;
                    case "Türkiye’de Nüfus":
                        intent = new Intent(contentListActivityCog.this, icerikViewActivity.class);
                        intent.putExtra("icerik",getString(R.string.cografya_nufus));
                        intent.putExtra("icerik2",getString(R.string.cografya_nufus_title));
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
        listDataHeader.add("Türkiye'nin Konumu");
        listDataHeader.add("Türkiye'nin Yeryüzü Şekilleri");
        listDataHeader.add("Türkiye'nin İklim Özellikleri");

        // Adding child data
        List<String> konum = new ArrayList<String>();
        konum.add("Türkiyenin Matematik Konumu");
        konum.add("Türkiyenin Matematik Konumunun Sonuçları");
        
        List<String> yeryuzu_sekil = new ArrayList<String>();
        yeryuzu_sekil.add("Türkiye’de Yeryüzü Şekilleri");
        yeryuzu_sekil.add("Türkiye'nin Dağları");
        yeryuzu_sekil.add("Türkiye’nin Ovaları");
        yeryuzu_sekil.add("Türkiye’nin Platoları");
        yeryuzu_sekil.add("Türkiye’de Doğal Afetler");
        yeryuzu_sekil.add("Türkiye'de Akarsular");
        yeryuzu_sekil.add("Akarsu Rejimleri ve Debi");
        yeryuzu_sekil.add("Türkiye'nin Yeraltı Suları");
        yeryuzu_sekil.add("Türkiye’nin Yer Şekilleri");
        yeryuzu_sekil.add("Türkiye’de Kıyı Tipleri");
        yeryuzu_sekil.add("Türkiye’de Göller ve Oluşumu");

        List<String> iklim_oz = new ArrayList<String>();
        iklim_oz.add("Türkiye’nin İklimi");
        iklim_oz.add("Türkiye’de Basınç ve Rüzgarlar");
        iklim_oz.add("Türkiye’de Yağış");
        iklim_oz.add("Türkiye’de Sıcaklık");
        iklim_oz.add("Türkiye’de İklim Tipleri ve Bitki Örtüsü");
        iklim_oz.add("Türkiye'de Karasal İklim");
        iklim_oz.add("Türkiye’de Nüfus");

        listDataChild.put(listDataHeader.get(0), konum); // Header, Child data
        listDataChild.put(listDataHeader.get(1), yeryuzu_sekil);
        listDataChild.put(listDataHeader.get(2), iklim_oz);
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
