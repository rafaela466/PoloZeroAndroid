package com.polozero.polozeroapp;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class MonoCom extends AppCompatActivity implements View.OnClickListener {
        PDFView pdfView;
        private CardView btnNavToLuzon,btnNavToAR35,btnNavToAvant,btnNavToConfort,btnNavToElite,btnNavToFJM,btnNavToERV,btnNavToCebu,btnNavToPure,btnNavToCassetes,btnNavToAltaP,btnNavToMediaP,btnNavToBaixaP,btnNavToConsolas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mono_com);

        btnNavToLuzon = (CardView) findViewById(R.id.serieLuzon);
        btnNavToAR35 = (CardView) findViewById(R.id.serieAR35);
        btnNavToAvant = (CardView) findViewById(R.id.serieAvant);
        btnNavToConfort = (CardView) findViewById(R.id.serieConfort);
        btnNavToElite = (CardView) findViewById(R.id.serieElite);
        btnNavToFJM = (CardView) findViewById(R.id.serieFJM);
        btnNavToERV = (CardView) findViewById(R.id.serieERV);
        btnNavToCebu = (CardView) findViewById(R.id.serieCebu);
        btnNavToPure = (CardView) findViewById(R.id.seriePure);
        btnNavToCassetes = (CardView) findViewById(R.id.serieCassetes);
        btnNavToAltaP = (CardView) findViewById(R.id.serieAltaP);
        btnNavToMediaP = (CardView) findViewById(R.id.serieMediaP);
        btnNavToBaixaP = (CardView) findViewById(R.id.serieBaixaP);
        btnNavToConsolas = (CardView) findViewById(R.id.serieConsolas);

        btnNavToLuzon.setOnClickListener(this);
        btnNavToAR35.setOnClickListener(this);
        btnNavToAvant.setOnClickListener(this);
        btnNavToConfort.setOnClickListener(this);
        btnNavToElite.setOnClickListener(this);
        btnNavToFJM.setOnClickListener(this);
        btnNavToERV.setOnClickListener(this);

        btnNavToCebu.setOnClickListener(this);
        btnNavToPure.setOnClickListener(this);
        btnNavToCassetes.setOnClickListener(this);
        btnNavToAltaP.setOnClickListener(this);
        btnNavToMediaP.setOnClickListener(this);
        btnNavToBaixaP.setOnClickListener(this);
        btnNavToConsolas.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()){
            case R.id.serieLuzon:Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/Solucoes-Climatizacao-Samsung-RAC-Serie-Luzon-002.pdf"));
                startActivity(browserIntent); break;
            case R.id.serieAR35:Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/02/Solucoes-Climatizacao-Samsung-RAC-Serie-AR35-editado.pdf"));
                startActivity(browserIntent4); break;
            case R.id.serieAvant:Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/03/Solucoes-Climatizacao-Samsung-RAC-Serie-WFAvant_v2.pdf"));
                startActivity(browserIntent1); break;
            case R.id.serieConfort:Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/03/Solucoes-Climatizacao-Samsung-RAC-Serie-WFConfort_v2.pdf"));
                startActivity(browserIntent2); break;
            case R.id.serieElite:Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/03/Solucoes-Climatizacao-Samsung-RAC-Serie-WFElite_v2.pdf"));
                startActivity(browserIntent3); break;
            case R.id.serieFJM:Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/03/Solucoes-Climatizacao-Samsung-FJM.pdf"));
            startActivity(browserIntent5);break;
            case R.id.serieERV:Intent browserIntent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/04/ERV_2019.pdf"));
            startActivity(browserIntent6);break;
            case R.id.serieCebu:Intent browserIntent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/03/Solucoes-Climatizacao-Samsung-RAC-Serie-Cebu.pdf"));
                startActivity(browserIntent7);break;
            case R.id.seriePure:Intent browserIntent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2021/03/Solucoes-Climatizacao-Samsung-RAC-Serie-Pure-1.0-1.pdf"));
                startActivity(browserIntent8);break;
            case R.id.serieCassetes:Intent browserIntent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/09/Samsung-AC-2019Cassetes-360.pdf"));
                startActivity(browserIntent9);break;
            case R.id.serieAltaP:Intent browserIntent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/10/Samsung-AC-2019-Condutas-APE.pdf"));
                startActivity(browserIntent10);break;
            case R.id.serieMediaP:Intent browserIntent11 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/10/Samsung-AC-2019-Condutas-MPE.pdf"));
                startActivity(browserIntent11);break;
            case R.id.serieBaixaP:Intent browserIntent12 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/10/Samsung-AC-2019-Condutas-BPE.pdf"));
                startActivity(browserIntent12);break;
            case R.id.serieConsolas:Intent browserIntent13 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/07/Samsung-AC-2019-Consolas.pdf"));
                startActivity(browserIntent13);break;

            default:break;
        }
    }
}
