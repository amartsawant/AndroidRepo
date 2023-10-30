package com.androidapps.adapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //AdapterView : ListView
        listView = findViewById(R.id.listView);

        // Datasource
        String[] countries = {"USA", "UK", "Australia", "India"};

        // Adapter
        ArrayAdapter<String> adapter  = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                countries
        );

        listView.setAdapter(adapter);
    }
}