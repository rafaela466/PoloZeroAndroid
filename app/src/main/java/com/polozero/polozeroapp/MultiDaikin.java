package com.polozero.polozeroapp;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class MultiDaikin extends AppCompatActivity implements View.OnClickListener {
    PDFView pdfView;
    private Button NavToMultiDaikin,NavToVRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_daikin);

        NavToMultiDaikin = (Button) findViewById(R.id.btnMultiDaikin);
        NavToVRV = (Button) findViewById(R.id.btnVRV);

        NavToMultiDaikin.setOnClickListener(this);
        NavToVRV.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()){
            case R.id.btnMultiDaikin:Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/DAIKIN-Multi_Split_R32.pdf"));
                startActivity(browserIntent); break;
            case R.id.btnVRV:Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/DAIKIN-VRVIII-s-.pdf"));
                startActivity(browserIntent1); break;
            default:break;
        }
    }
}
