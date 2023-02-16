package com.example.tablayoutviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    TableLayout tableLayout;
    ViewPager viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPager2);


    }
}