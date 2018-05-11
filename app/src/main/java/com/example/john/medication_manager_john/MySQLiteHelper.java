package com.example.john.medication_manager_john;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by John on 5/5/2018.
 */

public class MySQLiteHelper extends SQLiteOpenHelper {
    public static final String TABLE_MEDS = "meds";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_Name = "name";
    public static final String COLUMN_Amount = "amount";
    public static final String COLUMN_Unit = "unit";
    public static final String COLUMN_Frequency = "Frequency";

    public static final String DATABASE_NAME = "medication.db";

    public static final int DATABASE_VERSION = 101;


    private static final String DATABASE_CREATE = "create table"
            +TABLE_MEDS + "("
                +COLUMN_ID + "int primary key autoincrement,"
                +COLUMN_Name + "TEXT,"
                +COLUMN_Amount + "TEXT,"
                +COLUMN_Unit + "TEXT,"
                +COLUMN_Frequency + "TEXT"
            +");";

    private static MySQLiteHelper sInstance;
    public static synchronized MySQLiteHelper getInstance(Context context) {

        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = new MySQLiteHelper(context.getApplicationContext());
        }
        return sInstance;
    }
    private MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w("com.example.john.medication_manager_john.MySQLiteHelper", "Upgrading database from version " + oldVersion + " to "
                + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEDS);
        onCreate(db);
    }

}
