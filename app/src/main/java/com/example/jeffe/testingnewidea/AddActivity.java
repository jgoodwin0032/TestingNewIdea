package com.example.jeffe.testingnewidea;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jeffe.testingnewidea.DatabaseOperations;
import com.example.jeffe.testingnewidea.R;

import junit.framework.TestCase;

public class AddActivity extends AppCompatActivity {

    //declare our view variables

    private EditText ITEM_NAME;
    private EditText ITEM_CATEGORY;
    private EditText ITEM_COST;
    private Button mAddItemButton;
    private Button mClearTextButton;
    String item_name, item_category;
    //int item_id = 2; //needs to be setup to find the last ID used so we can add 1 to that and then assign the next new id.
    String item_cost;
    Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        ITEM_NAME = (EditText) findViewById(R.id.itemNameEditText);
        ITEM_CATEGORY = (EditText) findViewById(R.id.itemCategoryEditText);
        ITEM_COST = (EditText) findViewById(R.id.itemCostEditText);
        mAddItemButton = (Button) findViewById(R.id.AddItemButton);

        mAddItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                item_name = ITEM_NAME.getText().toString();
                item_category = ITEM_CATEGORY.getText().toString();
                item_cost = ITEM_COST.getText().toString();


                DatabaseOperations DB  = new DatabaseOperations(ctx);
                DB.putInformation(DB, item_name, item_category, item_cost);
                Toast.makeText(getBaseContext(), "Item Successfully Added", Toast.LENGTH_LONG).show();

                Toast.makeText(getBaseContext(), DB.getReadableDatabase().toString(), Toast.LENGTH_LONG).show();
                finish();

                setContentView(R.layout.activity_main);

            }
        });

        /** mClearTextButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        setContentView(R.layout.activity_add);
        ITEM_NAME.setText("");
        ITEM_CATEGORY.setText("");
        ITEM_COST.setText("");
        }
        });
         **/



    }
}
