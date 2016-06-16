package database.model;

/**
 * Created by iperc on 6/16/2016.
 */
public class konular {
    public static final String TAG = konular.class.getSimpleName();
    public static final String TABLE = "konular";

    public static final String KEY_dersId = "dersId";
    public static final String KEY_konuId = "konuId";
    public static final String KEY_konuAdi = "konuAdi";
    public static final String KEY_metin = "metin";

    private String dersId;
    private String konuId;
    private String konuAdi;
    private String metin;

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

    public String getKonuAdi() {
        return konuAdi;
    }

    public void setKonuAdi(String konuAdi) {
        this.konuAdi = konuAdi;
    }

    public String getMetin() {
        return metin;
    }

    public void setMetin(String metin) {
        this.metin = metin;
    }
}

