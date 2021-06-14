package com.polozero.polozeroapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class MitsuCatalogos extends AppCompatActivity implements View.OnClickListener {
        PDFView pdfView;
        private CardView btnAquecimento,btnPLA,btnHVRF,btnSEZM,btnSEZL,btnVentilo,btnEcodan,btnRooftop,btnRZ,btnY;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mitsu);

            btnAquecimento = (CardView) findViewById(R.id.btnAquecimento);
            btnPLA = (CardView) findViewById(R.id.btnPLA);
            btnHVRF = (CardView) findViewById(R.id.btnHVRF);
            btnSEZM = (CardView) findViewById(R.id.btnSEZM);
            btnSEZL = (CardView) findViewById(R.id.btnSEZL);
            btnVentilo = (CardView) findViewById(R.id.btnVentilo);
            btnEcodan = (CardView) findViewById(R.id.btnEcodan);
            btnRooftop = (CardView) findViewById(R.id.btnRooftop);
            btnRZ = (CardView) findViewById(R.id.btnRZ);
            btnY = (CardView) findViewById(R.id.btnY);


            btnAquecimento.setOnClickListener(this);
            btnPLA.setOnClickListener(this);
            btnHVRF.setOnClickListener(this);
            btnSEZM.setOnClickListener(this);
            btnSEZL.setOnClickListener(this);
            btnVentilo.setOnClickListener(this);
            btnEcodan.setOnClickListener(this);
            btnRooftop.setOnClickListener(this);
            btnRZ.setOnClickListener(this);
            btnY.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            Intent i;
            switch(view.getId()){
                case R.id.btnAquecimento:Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/05/Tabela-de-Preços-Aquecimento-2020.pdf"));
                    startActivity(browserIntent1); break;
                case R.id.btnPLA:Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/05/SériePLA-1.pdf"));
                    startActivity(browserIntent2); break;
                case R.id.btnHVRF:Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/04/Folheto-HVRF.pdf"));
                    startActivity(browserIntent3); break;
                case R.id.btnSEZM:Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/05/SEZ-M.pdf"));
                    startActivity(browserIntent4); break;
                case R.id.btnSEZL:Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/04/Mistubishi_SLZ-M.pdf"));
                    startActivity(browserIntent5); break;
                case R.id.btnVentilo:Intent browserIntent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/Tabela-de-Preços-Ventiloconvectores_2019.pdf"));
                    startActivity(browserIntent6); break;
                case R.id.btnEcodan:Intent browserIntent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/Tabela-de-Preços-Ecodan-2019.pdf"));
                    startActivity(browserIntent7); break;
                case R.id.btnRooftop:Intent browserIntent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/Tabela-de-Preços-Rooftop-_-UTA-DX-2018-19.pdf"));
                    startActivity(browserIntent8); break;
                case R.id.btnRZ:Intent browserIntent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/City-Multi-Hybrid-R32-Série-R2.pdf"));
                    startActivity(browserIntent9); break;
                case R.id.btnY:Intent browserIntent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/City-Multi-Hybrid-R32-Série-Y.pdf"));
                    startActivity(browserIntent10); break;
                default:break;
            }
        }
    }
