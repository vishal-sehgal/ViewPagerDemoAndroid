package com.developervishalsehgal.viewpagerdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.developervishalsehgal.viewpagerdemo.adapter.CustomSwipeAdapter;
import com.developervishalsehgal.viewpagerdemo.model.MyData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MyData> myData;
    ViewPager viewPager;
    CustomSwipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);

        adapter = new CustomSwipeAdapter(this, loadDummyData());
        viewPager.setAdapter(adapter);


    }

    private ArrayList<MyData> loadDummyData() {
        myData = new ArrayList<>();

      
        return myData;
    }
}
