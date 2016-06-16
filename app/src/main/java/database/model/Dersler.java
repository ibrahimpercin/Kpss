package database.model;

/**
 * Created by iperc on 6/16/2016.
 */
public class dersler {
    public static final String TAG = dersler.class.getSimpleName();
    public static final String TABLE = "dersler";

    public static final String KEY_dersId = "dersId";
    public static final String KEY_dersAdi = "dersAdi";

    private String dersId;
    private String dersAdi;

    public String getDersId() {
        return dersId;
    }

    public void setDersId(String dersId) {
        this.dersId = dersId;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

}
