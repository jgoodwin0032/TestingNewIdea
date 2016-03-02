package com.example.jeffe.testingnewidea;

import android.provider.BaseColumns;

/**
 * Created by jeffe on 2/15/2016.
 */
public class TableData {

    public TableData()
    {
    }

    public static abstract class TableInfo implements BaseColumns
    {
        public static final String ITEM_ID = "item_ID";
        public static final String ITEM_NAME = "item_name";
        public static final String ITEM_CATEGORY = "item_category";
        public static final String ITEM_COST = "item_cost";
        public static final String DATABASE_NAME = "item_info";
        public static final String TABLE_NAME = "items_info";


    }
}
