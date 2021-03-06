package com.polozero.polozeroapp;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Precos extends AppCompatActivity implements View.OnClickListener {
     PDFView pdfView;
     private CardView btnNavToSamsung,btnNavToDaikin,btnNavToDaitsu,btnNavToLG,btnNavToFujitsu,btnNavToMitsubishi,btnNavToTesto,btnNavToPolozero,btnNavToHtw, btnNavToGiatsu, btnNavToGaservei,btnNavToModulo,btnNavToDanfoss,btnNavToToyotomi;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precos);

   //   AdRequest on Builder (can't get device ID)
   //   MobileAds.initialize(this, "ca-app-pub-6960646842869845~6092978636");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btnNavToPolozero = (CardView) findViewById(R.id.btnPolozeroPrice);
        btnNavToSamsung = (CardView) findViewById(R.id.btnSamsungPrice);
        btnNavToDaikin = (CardView) findViewById(R.id.btnDaikinPrice);
        btnNavToDaitsu = (CardView) findViewById(R.id.btnDaitsuPrice);
        btnNavToLG = (CardView) findViewById(R.id.btnLgPrice);
        btnNavToFujitsu = (CardView) findViewById(R.id.btnFujitsuPrice);
        btnNavToMitsubishi = (CardView) findViewById(R.id.btnMitsubishiPrice);
        btnNavToTesto = (CardView) findViewById(R.id.btnTestoPrice);
        btnNavToHtw = (CardView)findViewById(R.id.btnHtwPrice);
        btnNavToGiatsu = (CardView)findViewById(R.id.btnGiatsuPrice);
        btnNavToGaservei = (CardView)findViewById(R.id.btnGaserveiPrice);
        btnNavToModulo = (CardView)findViewById(R.id.btnModulRaPrice);
        btnNavToDanfoss = (CardView)findViewById(R.id.btnDanfossPrice);
        btnNavToToyotomi = (CardView)findViewById(R.id.btnToyotomiPrice);

        btnNavToHtw.setOnClickListener(this);
        btnNavToPolozero.setOnClickListener(this);
        btnNavToSamsung.setOnClickListener(this);
        btnNavToDaikin.setOnClickListener(this);
        btnNavToDaitsu.setOnClickListener(this);
        btnNavToLG.setOnClickListener(this);
        btnNavToFujitsu.setOnClickListener(this);
        btnNavToMitsubishi.setOnClickListener(this);
        btnNavToTesto.setOnClickListener(this);
        btnNavToGiatsu.setOnClickListener(this);
        btnNavToGaservei.setOnClickListener(this);
        btnNavToModulo.setOnClickListener(this);
        btnNavToDanfoss.setOnClickListener(this);
        btnNavToToyotomi.setOnClickListener(this);
    }

    @Override
        public void onClick(View view) {
            Intent i;

            switch(view.getId()){
                case R.id.btnPolozeroPrice:  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/Cata??logoGeralPoloZero2020.pdf"));
                    startActivity(browserIntent); break;
                case R.id.btnSamsungPrice :  Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/08/Samsung-Tabela-Precos-2021_Setembro_LR.pdf"));
                    startActivity(browserIntent1); break;
                case R.id.btnDaikinPrice : Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/08/DAIKIN-Tabela-de-Precos-2021-V2.pdf"));
                    startActivity(browserIntent2); break;
                case R.id.btnDaitsuPrice : Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2022/01/TP_DaitsuAumento2020.pdf"));
                    startActivity(browserIntent3); break;
                case R.id.btnLgPrice: Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/05/TabelaLG2021.pdf"));
                    startActivity(browserIntent4); break;
                case R.id.btnFujitsuPrice: Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/03/??-Tabela_Fujitsu_Climatizac??a??o_2020_V2-desbloqueado.pdf"));
                    startActivity(browserIntent5); break;
                case R.id.btnMitsubishiPrice: Intent browserIntent6 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://polozero.com/wp-content/uploads/2021/05/Mitsubishi-tabela-precos2021.pdf"));
                    startActivity(browserIntent6); break;
                case R.id.btnTestoPrice: Intent browserIntent8 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://polozero.com/wp-content/uploads/2021/01/Catalogo-testo2021.pdf"));
                    startActivity(browserIntent8); break;
                case R.id.btnHtwPrice:  Intent browserIntent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/10/HTW-OUTUBRO.pdf"));
                    startActivity(browserIntent9); break;
                case R.id.btnGiatsuPrice: Intent browserIntent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1OMvj6HAD15GZGLJIn3X4570v7DYX5k5t/view?usp=sharing"));
                    startActivity(browserIntent10); break;
                case R.id.btnGaserveiPrice: Intent browserIntent12 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/Cat??logo-Gas-Servei-2020.pdf"));
                    startActivity(browserIntent12); break;
                case R.id.btnModulRaPrice: Intent browserIntent99= new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/Catalogo_Modulrack.pdf"));
                    startActivity(browserIntent99); break;
                case R.id.btnDanfossPrice: Intent browserIntent14 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/02/Danfoss2.pdf"));
                    startActivity(browserIntent14); break;
                case R.id.btnToyotomiPrice: Intent browserIntent15 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/08/Toyotomi_Setembro_2021.pdf"));
                    startActivity(browserIntent15); break;
                default:break;
            }
        }
}