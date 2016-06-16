package app;

import android.app.Application;
import android.content.Context;

import database.DBHelper;
import database.DatabaseManager;

/**
 * Created by iperc on 6/16/2016.
 */
public class App extends Application {
    private static Context context;
    private static DBHelper dbHelper;

    @Override
    public void onCreate()
    {
        super.onCreate();
        context = this.getApplicationContext();
        dbHelper = new DBHelper();
        DatabaseManager.initializeInstance(dbHelper);

    }

    public static Context getContext(){
        return context;
    }
}
