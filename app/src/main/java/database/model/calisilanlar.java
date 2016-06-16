package database.model;

/**
 * Created by iperc on 6/16/2016.
 */
public class calisilanlar {
    public static final String TAG = calisilanlar.class.getSimpleName();
    public static final String TABLE = "Calisilanlar";

    public static final String KEY_dersId = "dersId";
    public static final String KEY_konuId = "konuId";

    private String dersId;
    private String konuId;

    public String getDersId() {
        return dersId;
    }

    public void setDersId(String dersId) {
        this.dersId = dersId;
    }

    public String getKonuId() {
        return konuId;
    }

    public void setKonuId(String konuId) {
        this.konuId = konuId;
    }

}
