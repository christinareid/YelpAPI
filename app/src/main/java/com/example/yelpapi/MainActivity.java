package com.example.yelpapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    public static List<String> listVals;
    //public static List<String> listNums;
    public static ArrayAdapter<String> aa;
    //public static ArrayAdapter<String> aa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listVals = new ArrayList<>();
        aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listVals);
        //aa2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text2, listNums);
        ListView lv = findViewById(R.id.lV);
        lv.setAdapter(aa);
        YelpAPI yelp = new YelpAPI();
        yelp.start();
    }
    public void onClickGrabItems(View v)
    {
        aa.notifyDataSetChanged();
    }
}
