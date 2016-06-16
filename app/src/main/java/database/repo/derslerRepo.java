package database.repo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import database.DatabaseManager;
import database.model.dersler;

/**
 * Created by iperc on 6/16/2016.
 */
public class derslerRepo {

    private database.model.dersler dersler;

    public derslerRepo(){

        dersler= new dersler();

    }
    //Tablo oluştur
    public static String createTable(){
        return "CREATE TABLE " + database.model.dersler.TABLE  + "("
                + database.model.dersler.KEY_dersId  + "  INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + database.model.dersler.KEY_dersAdi + " TEXT )";
    }
    //İnser işlemi
    public int insert(dersler course) {
        int dersId;
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(dersler.KEY_dersId, course.getDersId());
        values.put(dersler.KEY_dersAdi, course.getDersAdi());

        // Inserting Row
        dersId=(int)db.insert(dersler.TABLE, null, values);
        DatabaseManager.getInstance().closeDatabase();

        return dersId;
    }
    //Delete işlemi
    public void delete( ) {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(dersler.TABLE,null,null);
        DatabaseManager.getInstance().closeDatabase();
    }
}
