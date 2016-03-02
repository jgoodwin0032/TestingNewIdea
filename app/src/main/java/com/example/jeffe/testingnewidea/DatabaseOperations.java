package com.example.jeffe.testingnewidea; /**
 * Created by jeffe on 2/15/2016.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.jeffe.testingnewidea.TableData;

public class DatabaseOperations extends SQLiteOpenHelper {

    public static final int database_version = 1;
    public String CREATE_QUERY = "CREATE TABLE " + TableData.TableInfo.TABLE_NAME + " (" + TableData.TableInfo.ITEM_ID + " INT PRIMARY KEY, " + TableData.TableInfo.ITEM_NAME + " TEXT, " + TableData.TableInfo.ITEM_CATEGORY + " TEXT, " + TableData.TableInfo.ITEM_COST + " TEXT);";

    public DatabaseOperations(Context context){
        super(context, TableData.TableInfo.DATABASE_NAME, null, database_version);
        Log.d("Database operations", "DataBase created");


    }

    @Override
    public void onCreate(SQLiteDatabase sdb){

        sdb.execSQL(CREATE_QUERY);
        Log.d("Database operations", "Table created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){
        //TODO auto-generated method stub
    }


    public void putInformation(DatabaseOperations dop, String name, String category, String cost ){
        SQLiteDatabase SQ = dop.getWritableDatabase();
        ContentValues cv = new ContentValues();
        //cv.put(TableData.TableInfo.ITEM_ID, id);
        cv.put(TableData.TableInfo.ITEM_NAME, name);
        cv.put(TableData.TableInfo.ITEM_CATEGORY, category);
        cv.put(TableData.TableInfo.ITEM_COST, cost);
        long k =SQ.insert(TableData.TableInfo.TABLE_NAME, null , cv);
        Log.d("Database operations", "One row inserted");

    }
}
