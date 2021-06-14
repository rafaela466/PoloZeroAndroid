package com.polozero.polozeroapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SamsungCatalog extends AppCompatActivity {

    private Button btnNavToMonoCom;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung_catalog);
        btnNavToMonoCom = (Button) findViewById(R.id.btnMonoCom);

        //AdRequest on Builder (can't get device ID)
        MobileAds.initialize(this, "ca-app-pub-6960646842869845~6092978636");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        btnNavToMonoCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SamsungCatalog.this, MonoCom.class));
            }
        });


    }
}
