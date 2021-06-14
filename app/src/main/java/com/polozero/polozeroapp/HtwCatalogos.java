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

public class HtwCatalogos extends AppCompatActivity implements View.OnClickListener {
        PDFView pdfView;
        private CardView btnNavToLion,btnNavToVA,btnNavToVAX,btnNavToAcumu;
        private AdView mAdView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_htwcatalogos);

            btnNavToLion = (CardView)findViewById(R.id.serieLion);
            btnNavToVA = (CardView)findViewById(R.id.serieHPWH);
            btnNavToVAX = (CardView)findViewById(R.id.serieVAX300);
            btnNavToAcumu = (CardView)findViewById(R.id.serieHPWHH);


            btnNavToLion.setOnClickListener(this);
            btnNavToVA.setOnClickListener(this);
            btnNavToVAX.setOnClickListener(this);
            btnNavToAcumu.setOnClickListener(this);

        }

        //Só se ATUALIZAR a APP é que os PDF's ficam ONLINE

        @Override
        public void onClick(View view) {
            Intent i;

            switch(view.getId()){
                case R.id.serieLion: Intent browserIntent1 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://polozero.com/wp-content/uploads/2020/02/FT-Bomba-calor-piscinas-LION-HTW-PR.pdf"));
                startActivity(browserIntent1);break;
                case R.id.serieHPWH: Intent browserIntent2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://polozero.com/wp-content/uploads/2020/02/FT-Acumualdor-Aerotérmico-VA1-ES.pdf"));
                    startActivity(browserIntent2);break;
                case R.id.serieVAX300: Intent browserIntent3 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://polozero.com/wp-content/uploads/2020/02/FT-Acumualdor-Aerotérmico-VAX-300-PR.pdf"));
                    startActivity(browserIntent3);break;
                case R.id.serieHPWHH: Intent browserIntent4 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://polozero.com/wp-content/uploads/2020/02/FT-Acumulador-200L-200L-solar.pdf"));
                    startActivity(browserIntent4);break;
                default:break;
            }
        }
    }

