package com.polozero.polozeroapp;

import android.content.Intent;
import android.net.Uri;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HelpDesk extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_desk);
        //AdRequest on Builder (can't get device ID)
       // MobileAds.initialize(this, "ca-app-pub-6960646842869845~6092978636");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Declaração de variaveis
        Button btnNavToLoja1 = (Button) findViewById(R.id.btnLoja1);
        Button btnNavToLoja2 = (Button) findViewById(R.id.btnLoja2);


        // Vai abrir o google maps nas coordenadas onde fica a LOJA 1
        btnNavToLoja1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:38.748223,9.140388"));
                startActivity(i);
            }
        });


        // Vai abrir o google maps nas coordenadas onde fica a LOJA 2
        btnNavToLoja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:39.795710,9.137535"));
                startActivity(i);
            }
        });
    }
}