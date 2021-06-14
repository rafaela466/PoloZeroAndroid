package com.polozero.polozeroapp;

import android.content.Intent;
import android.net.Uri;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
//import androidx.cardview.widget.CardView;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class MultiDomestico extends AppCompatActivity implements View.OnClickListener{
        PDFView pdfView;
        private CardView btnNavToSerieXA,btnNavToSerieXC,btnNavToSerieSA,btnNavToSeriePE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_domestico);

        btnNavToSerieXA = (CardView) findViewById(R.id.btnSerieXA);
        btnNavToSerieXC = (CardView) findViewById(R.id.btnSerieXC);
        btnNavToSerieSA = (CardView) findViewById(R.id.btnSerieSA);
        btnNavToSeriePE = (CardView) findViewById(R.id.btnSeriePE);

        btnNavToSerieXA.setOnClickListener(this);
        btnNavToSerieXC.setOnClickListener(this);
        btnNavToSerieSA.setOnClickListener(this);
        btnNavToSeriePE.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()){
            case R.id.btnSerieXA:Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1CSnyT1XB10McI6yMGn17VjYXhJaQZUB0/view?usp=sharing"));
                startActivity(browserIntent); break;
            case R.id.btnSerieXC:Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/12MN9r7dJfuuoHqE0GZ96DqvCFHXFbdhp/view?usp=sharing"));
                startActivity(browserIntent1); break;
            case R.id.btnSerieSA:Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1oauMT2QMA1IUH02r1hwfOnnoYwT8vcyw/view?usp=sharing"));
                startActivity(browserIntent2); break;
            case R.id.btnSeriePE:Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1M56cEGVOJ9yx8trzgk2jwyNYti3ysgkS/view?usp=sharing"));
                startActivity(browserIntent3); break;
            default:break;
        }
    }
}
