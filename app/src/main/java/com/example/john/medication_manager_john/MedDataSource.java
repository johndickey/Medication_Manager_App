package com.example.john.medication_manager_john;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;


/**
 * Created by John on 5/5/2018.
 */

public class MedDataSource {

    private SQLiteDatabase database;
    private MySQLiteHelper dbHelper;

    public MedDataSource(Context context) {
        dbHelper = MySQLiteHelper.getInstance(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public meds createMeds(String name, String amount, String unit, String Frequency) {
        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper.COLUMN_Name, name);
        values.put(MySQLiteHelper.COLUMN_Amount, amount);
        values.put(MySQLiteHelper.COLUMN_Unit, unit);
        values.put(MySQLiteHelper.COLUMN_Frequency, Frequency);

        long instertId = database.insert(MySQLiteHelper.TABLE_MEDS, null, values);
        meds newMeds = new meds(instertId, name, amount, unit, Frequency);
        return newMeds;
    }


    }
}
