package com.polozero.polozeroapp;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class AquecDaikin extends AppCompatActivity implements View.OnClickListener {
    PDFView pdfView;
    private CardView btnNavToAquecimentoDaikin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aquec_daikin);

        btnNavToAquecimentoDaikin = (CardView) findViewById(R.id.btnAquecimentoDaikin);

        btnNavToAquecimentoDaikin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()){
            case R.id.btnAquecimentoDaikin:Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2022/08/daikin_catalogo_2022.pdf"));
                startActivity(browserIntent); break;
            default:break;
        }
    }
}
