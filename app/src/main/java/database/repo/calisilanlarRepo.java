package database.repo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import database.DatabaseManager;
import database.model.dersler;
import database.model.calisilanlar;

/**
 * Created by iperc on 6/16/2016.
 */
public class calisilanlarRepo {

    private database.model.calisilanlar calisilanlar;

    public calisilanlarRepo(){

        calisilanlar= new database.model.calisilanlar();

    }
    //Tablo oluştur
    public static String createTable(){
        return "CREATE TABLE " + database.model.calisilanlar.TABLE  + "("
                + database.model.calisilanlar.KEY_dersId  + " INTEGER ,"
                + database.model.calisilanlar.KEY_konuId + " INTEGER )";
    }
    //İnsert işlemi
    public void insert(database.model.calisilanlar course) {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(calisilanlar.KEY_dersId, calisilanlar.getDersId());
        values.put(calisilanlar.KEY_konuId, calisilanlar.getKonuId());

        // Inserting Row
        db.insert(calisilanlar.TABLE, null, values);
        DatabaseManager.getInstance().closeDatabase();
    }

    //Delete işlemi
    public void delete( ) {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(database.model.calisilanlar.TABLE,null,null);
        DatabaseManager.getInstance().closeDatabase();
    }
}
