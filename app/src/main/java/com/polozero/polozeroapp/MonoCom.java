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
        private CardView btnNavToLuzon,btnNavToAR35,btnNavToAvant,btnNavToConfort,btnNavToElite,btnNavToFJM,btnNavToERV;

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

        btnNavToLuzon.setOnClickListener(this);
        btnNavToAR35.setOnClickListener(this);
        btnNavToAvant.setOnClickListener(this);
        btnNavToConfort.setOnClickListener(this);
        btnNavToElite.setOnClickListener(this);
        btnNavToFJM.setOnClickListener(this);
        btnNavToERV.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()){
            case R.id.serieLuzon:Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19b2zASBt7lb45xSrEE99LyQCfQgtEJA9/view?usp=sharing"));
                startActivity(browserIntent); break;
            case R.id.serieAR35:Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/129PGXqn-6tXOgpaL70NlHILx9egj_B7I/view?usp=sharing"));
                startActivity(browserIntent4); break;
            case R.id.serieAvant:Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1NH6p-DUH7fU2S5kMp8TcKpUJzgDkzVKY/view?usp=sharing"));
                startActivity(browserIntent1); break;
            case R.id.serieConfort:Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1R7vOV3JTJLi9jFeHJ7atPN65Yp5mq6E7/view?usp=sharing"));
                startActivity(browserIntent2); break;
            case R.id.serieElite:Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1wVCCgO-elwJla2PyNelu-qs-ICOMnzhj/view?usp=sharing"));
                startActivity(browserIntent3); break;
            case R.id.serieFJM:Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/03/Solucoes-Climatizacao-Samsung-FJM.pdf"));
            startActivity(browserIntent5);break;
            case R.id.serieERV:Intent browserIntent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2020/04/ERV_2019.pdf"));
            startActivity(browserIntent6);break;

            default:break;
        }
    }
}
