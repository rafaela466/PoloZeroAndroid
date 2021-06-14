package com.polozero.polozeroapp;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class SkyDaikin extends AppCompatActivity implements View.OnClickListener {
    PDFView pdfView;
    private CardView btnNavToSky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sky_daikin);

        btnNavToSky = (CardView) findViewById(R.id.btnSkyAir);

        btnNavToSky.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()){
            case R.id.btnSkyAir:Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/Sky-Air-A-series_Product-profile_ECPPT17-116_Portuguese.pdf"));
                startActivity(browserIntent); break;
            default:break;
        }
    }
}
