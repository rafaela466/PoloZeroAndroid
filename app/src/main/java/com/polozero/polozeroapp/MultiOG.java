package com.polozero.polozeroapp;

import android.content.Intent;
import android.net.Uri;import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class MultiOG extends AppCompatActivity implements View.OnClickListener{
    PDFView pdfView;
    private CardView btnNavMultiOG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_og);

        btnNavMultiOG = (CardView) findViewById(R.id.btnMultiOG);

        btnNavMultiOG.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()){
            case R.id.btnMultiOG:Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/110RrRSgQurXaYTJrTizDFCfiUvSW1QCg/view?usp=sharing"));
                startActivity(browserIntent); break;
            default:break;
        }
    }
}
