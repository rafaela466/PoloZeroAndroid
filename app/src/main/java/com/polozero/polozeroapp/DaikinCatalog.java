package com.polozero.polozeroapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DaikinCatalog extends AppCompatActivity {

    private Button btnNavToDom,btnNavToMulti,btnNavToSky, btnNavToAquec;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daikin_catalog);

        //AdRequest on Builder (can't get device ID)
        MobileAds.initialize(this, "ca-app-pub-6960646842869845~6092978636");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btnNavToMulti = (Button) findViewById(R.id.btnMulti);
        btnNavToDom = (Button) findViewById(R.id.btnDom);
        btnNavToSky = (Button) findViewById(R.id.btnSkyAir);
        btnNavToAquec = (Button) findViewById(R.id.btnAquec);

        btnNavToMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DaikinCatalog.this, MultiDaikin.class));
            }
        });

        btnNavToDom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DaikinCatalog.this, DomDaikin.class));
            }
        });
        btnNavToSky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DaikinCatalog.this, SkyDaikin.class));
            }
        });
        btnNavToAquec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DaikinCatalog.this, AquecDaikin.class));
            }
        });
    }
}
