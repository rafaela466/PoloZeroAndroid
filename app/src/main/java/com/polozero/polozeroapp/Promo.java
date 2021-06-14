package com.polozero.polozeroapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Promo extends AppCompatActivity{
    ViewPager viewPager;
    CustomSwip  customSwip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);

        viewPager=(ViewPager)findViewById(R.id.viewPager);
        customSwip=new CustomSwip(this);
        viewPager.setAdapter(customSwip);
    }
}
