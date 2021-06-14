package com.polozero.polozeroapp;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class DomDaikin extends AppCompatActivity implements View.OnClickListener {
        PDFView pdfView;
        private CardView btnNavToUruru,btnNavToEmura,btnNavToPerfera,
                btnNavToComfora,btnNavToSensira,btnNavToBaixoDaikin,btnNavToChaoDaikin,
                btnNavToNexura,btnNavToChaoTetoDaikin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dom_daikin);

        btnNavToUruru = (CardView) findViewById(R.id.btnUruru);
        btnNavToEmura = (CardView) findViewById(R.id.btnEmura);
        btnNavToPerfera = (CardView) findViewById(R.id.btnPerfera);
        btnNavToComfora = (CardView) findViewById(R.id.btnComfora);
        btnNavToSensira = (CardView) findViewById(R.id.btnSensira);
        btnNavToBaixoDaikin = (CardView) findViewById(R.id.btnCondutasDaikin);
        btnNavToChaoDaikin = (CardView) findViewById(R.id.btnChaoDaikin);
        btnNavToNexura = (CardView) findViewById(R.id.btnNexura);
        btnNavToChaoTetoDaikin = (CardView) findViewById(R.id.btnChaoTetoDaikin);

        btnNavToUruru.setOnClickListener(this);
        btnNavToEmura.setOnClickListener(this);

        btnNavToPerfera.setOnClickListener(this);
        btnNavToComfora.setOnClickListener(this);
        btnNavToSensira.setOnClickListener(this);
        btnNavToBaixoDaikin.setOnClickListener(this);
        btnNavToChaoDaikin.setOnClickListener(this);
        btnNavToNexura.setOnClickListener(this);
        btnNavToChaoTetoDaikin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()){
            case R.id.btnUruru:Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/ECPPT15-021_FTXZ-N__Ururu_Sarara_Catalogo_PT.pdf"));
                startActivity(browserIntent); break;
            case R.id.btnEmura:Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/DAPT16-041_FTXJ-M_Emura_R-32.pdf"));
                startActivity(browserIntent1); break;
            case R.id.btnPerfera:Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tfu3TUCnxV5yfR3bGH4ncssIc_04MssK/view?usp=sharing"));
                startActivity(browserIntent3); break;
            case R.id.btnComfora:Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/ECPPT18-046-Unidade-mural-Comfora_FTXP-L.pdf"));
                startActivity(browserIntent4); break;
            case R.id.btnSensira:Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/ECPPT18-006-Unidade-mural-Sensira_FTXF-A.pdf"));
                startActivity(browserIntent5); break;
            case R.id.btnCondutasDaikin:Intent browserIntent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/ECPPT17-029_Unidade_de_condutas_FDXM_F3.pdf"));
                startActivity(browserIntent6); break;
            case R.id.btnChaoDaikin:Intent browserIntent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/ECPPT17-028_Unidade_de_chao_FVXM-F.pdf"));
                startActivity(browserIntent7); break;
            case R.id.btnNexura:Intent browserIntent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/DAPT16-006_FVXG-K_Nexura.pdf"));
                startActivity(browserIntent8); break;
            case R.id.btnChaoTetoDaikin:Intent browserIntent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://polozero.com/wp-content/uploads/2019/12/ECPPT15-030_FLXS-B9_Chao_Teto.pdf"));
                startActivity(browserIntent9); break;
            default:break;
        }
    }
}
