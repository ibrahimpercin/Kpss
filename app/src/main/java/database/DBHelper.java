package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.iperc.kpss.MainActivity;

import app.App;
import database.model.calisilanlar;
import database.model.dersler;
import database.model.konular;
import database.repo.calisilanlarRepo;
import database.repo.derslerRepo;
import database.repo.konularRepo;

/**
 * Created by iperc on 6/16/2016.
 */
public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //DATABASE İŞLEMLERİ------
    //Version
    private static final int DATABASE_VERSION =8;

    //Database ismi
    private static final String DATABASE_NAME = "ders_db";
    private static final String TAG = DBHelper.class.getSimpleName().toString();

    //Tablo isimleri
    private static final String TABLE_DERSLER = "dersler";
    private static final String TABLE_KONULAR = "konular";
    private static final String TABLE_CALISILANLAR = "calisilanlar";

    public DBHelper( ) {
        super(App.getContext(), DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Daha önce database oluşturulmadıysa çalısır
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(derslerRepo.createTable());
        db.execSQL(konularRepo.createTable());
        db.execSQL(calisilanlarRepo.createTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d(TAG, String.format("SQLiteDatabase.onUpgrade(%d -> %d)", oldVersion, newVersion));

        // Drop table if existed, all data will be gone!!!
        db.execSQL("DROP TABLE IF EXISTS " + dersler.TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + konular.TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + calisilanlar.TABLE);
        onCreate(db);
    }
}