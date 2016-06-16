package database.repo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import database.DatabaseManager;
import database.model.konular;

/**
 * Created by iperc on 6/16/2016.
 */
public class konularRepo {

    private database.model.konular konular;

    public konularRepo(){

        konular= new database.model.konular();

    }
    //Tablo oluştur
    public static String createTable(){
        return "CREATE TABLE " + database.model.konular.TABLE  + "("
                + database.model.konular.KEY_dersId  + "   PRIMARY KEY    ,"
                + database.model.konular.KEY_konuId + " INTEGER,"
                + database.model.konular.KEY_konuAdi+" TEXT,"
                + database.model.konular.KEY_metin+" TEXT )";
    }
    //İnsert işlemi
    public void insert(konular course) {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(konular.KEY_dersId, konular.getDersId());
        values.put(konular.KEY_konuId, konular.getKonuId());
        values.put(konular.KEY_konuAdi, konular.getKonuAdi());
        values.put(konular.KEY_metin, konular.getMetin());

        // Inserting Row
        db.insert(konular.TABLE, null, values);
        DatabaseManager.getInstance().closeDatabase();
    }

    //Delete işlemi
    public void delete( ) {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(konular.TABLE,null,null);
        DatabaseManager.getInstance().closeDatabase();
    }
}
