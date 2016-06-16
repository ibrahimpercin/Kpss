package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.iperc.kpss.MainActivity;

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

    //Daha önce database oluşturulmadıysa çalısır
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}