package com.polozero.polozeroapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Catalogos extends AppCompatActivity implements View.OnClickListener {
    PDFView pdfView;
    private CardView btnNavToSamsung,btnNavToDaikin,btnNavToDaitsu,btnNavToWigam,btnNavToLG,btnNavToFujitsu,btnNavToMitsubishi,btnNavToTesto,btnNavToPolozero,btnNavToHtw,btnNavToGiatsu,btnNavToGaservei,btnNavToModul,btnNavToKaimann,btnNavToZanotti,btnNavToBoxcold,btnNavToSupply, btnNavToToyotomiCat;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogos);

        //AdRequest on Builder (can't get device ID)
        MobileAds.initialize(this, "ca-app-pub-6960646842869845~6092978636");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btnNavToSamsung = (CardView)findViewById(R.id.btnSamsungPrice);
        btnNavToDaikin = (CardView)findViewById(R.id.btnDaikinPrice);
        btnNavToDaitsu = (CardView)findViewById(R.id.btnDaitsuPrice);
        btnNavToLG = (CardView)findViewById(R.id.btnLgPrice);
        btnNavToFujitsu = (CardView)findViewById(R.id.btnFujitsuPrice);
        btnNavToMitsubishi = (CardView)findViewById(R.id.btnMitsubishiPrice);
        btnNavToKaimann = (CardView)findViewById(R.id.btnKaimannPrice);
        btnNavToZanotti = (CardView)findViewById(R.id.btnZanottiPrice);
        btnNavToBoxcold = (CardView)findViewById(R.id.btnBoxColdPrice);
        btnNavToSupply = (CardView)findViewById(R.id.btnSupplygas);
        btnNavToTesto = (CardView)findViewById(R.id.btnTestoPrice);
        btnNavToPolozero = (CardView)findViewById(R.id.btnPolozeroPrice);
        btnNavToHtw = (CardView)findViewById(R.id.btnHtwPrice);
        btnNavToGiatsu = (CardView)findViewById(R.id.btnGiatsuPrice);
        btnNavToGaservei = (CardView)findViewById(R.id.btnGaserveiPrice);
        btnNavToModul = (CardView)findViewById(R.id.btnModulRackPrice);
        btnNavToToyotomiCat = (CardView)findViewById(R.id.btnToyotomiCat);
        btnNavToWigam = (CardView)findViewById(R.id.btnWigam);


        btnNavToGiatsu.setOnClickListener(this);
        btnNavToHtw.setOnClickListener(this);
        btnNavToPolozero.setOnClickListener(this);
        btnNavToSamsung.setOnClickListener(this);
        btnNavToDaikin.setOnClickListener(this);
        btnNavToDaitsu.setOnClickListener(this);
        btnNavToLG.setOnClickListener(this);
        btnNavToFujitsu.setOnClickListener(this);
        btnNavToMitsubishi.setOnClickListener(this);
        btnNavToKaimann.setOnClickListener(this);
        btnNavToZanotti.setOnClickListener(this);
        btnNavToBoxcold.setOnClickListener(this);
        btnNavToSupply.setOnClickListener(this);
        btnNavToTesto.setOnClickListener(this);
        btnNavToGaservei.setOnClickListener(this);
        btnNavToModul.setOnClickListener(this);
        btnNavToToyotomiCat.setOnClickListener(this);
        btnNavToWigam.setOnClickListener(this);

        btnNavToSamsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Catalogos.this, SamsungCatalog.class));
            }
        });

        btnNavToDaikin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Catalogos.this, DaikinCatalog.class));
            }
        });

        btnNavToMitsubishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Catalogos.this, MitsuCatalogos.class));
            }
        });

        btnNavToHtw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Catalogos.this, HtwCatalogos.class));
            }
        });
    }

   //Só a ATUALIZAR a APP é que os PDF'S ficam ONLINE

    @Override
    public void onClick(View view) {
        Intent i;

        switch(view.getId()){
            case R.id.btnPolozeroPrice :  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1CZF_I68QtGzxjEl4rGtgzZtZkVt3nSlx/view?usp=sharing"));
                startActivity(browserIntent); break;
            case R.id.btnDaitsuPrice : Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/05/DAITSU_2020-editado.pdf"));
                startActivity(browserIntent3); break;
            case R.id.btnLgPrice: Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/05/TabelaLG2021.pdf"));
                startActivity(browserIntent4); break;
            case R.id.btnFujitsuPrice: Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/03/©-Tabela_Fujitsu_Climatização_2020_V2-desbloqueado.pdf"));
                startActivity(browserIntent5); break;
            case R.id.btnTestoPrice: Intent browserIntent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/01/Catalogo-testo2021.pdf"));
                startActivity(browserIntent8); break;
            case R.id.btnGiatsuPrice: Intent browserIntent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1OMvj6HAD15GZGLJIn3X4570v7DYX5k5t/view?usp=sharing"));
                startActivity(browserIntent10); break;
            case R.id.btnGaserveiPrice: Intent browserIntent12 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/Catálogo-Gas-Servei-2020.pdf"));
                startActivity(browserIntent12); break;
            case R.id.btnModulRackPrice: Intent browserIntent99 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/Catalogo_Modulrack.pdf"));
                startActivity(browserIntent99); break;
            case R.id.btnKaimannPrice: Intent browserIntent77 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/KAIMAN.pdf"));
                startActivity(browserIntent77); break;
            case R.id.btnZanottiPrice: Intent browserIntent76 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/Zanotti2019.pdf"));
                startActivity(browserIntent76); break;
            case R.id.btnBoxColdPrice: Intent browserIntent71 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/BOXCOLD.pdf"));
                startActivity(browserIntent71); break;
            case R.id.btnSupplygas: Intent browserIntent110 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/importsuply.pdf"));
                startActivity(browserIntent110);
            case R.id.btnToyotomiCat: Intent browserIntent199 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/08/TOYOTOMI-Catálogo-Geral.pdf"));
                startActivity(browserIntent199);
            case R.id.btnWigam: Intent browserIntent198 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/03/Wigam2021.pdf"));
                startActivity(browserIntent198);
            default:break;
        }
    }
}
