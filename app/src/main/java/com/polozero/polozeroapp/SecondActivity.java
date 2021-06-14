package com.polozero.polozeroapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText input;
    Button showBtn;
    private EditText editTextPass;
    private FirebaseAuth firebaseAuth;
    private CardView tabela_preços2, catalogos2, promo2, helpdesk2;
    private Button logout;


    @Override
    public void onBackPressed() {
        AlertDialog diaBox = AskOption();
        diaBox.show();
    }

    private AlertDialog AskOption() {
        AlertDialog myQuittingDialogBox = new AlertDialog.Builder(this)
                .setTitle("Sair")
                .setMessage("Tem a certeza que quer sair da sua conta?")
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        finish();
                    }
                })
                .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        return myQuittingDialogBox;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Locked asking for passcode --
        setContentView(R.layout.activity_second);
        firebaseAuth = FirebaseAuth.getInstance();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Administrador.");
        builder.setIcon(R.drawable.logo_android);
        builder.setMessage("Função apenas disponível para um administrador-");

        input = new EditText(this);
        builder.setView(input);

        //Positive Btn - Enters the activity where you send the IMG's

        builder.setPositiveButton("Entrar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String txt = input.getText().toString();
                if (txt.equals("ZEROPOLO2018")) {
                    startActivity(new Intent(SecondActivity.this, Main2Activity.class));
                }
            }
        });

        //Negative Btn - Closes the AlertBox
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        //Create the(?) dialog
        final AlertDialog ad = builder.create();

        //BUTTON
        showBtn = (Button) findViewById(R.id.button1);
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ad.show();
            }
        });

        // Defining CardView
        tabela_preços2 = (CardView) findViewById(R.id.tabela_preços);
        catalogos2 = (CardView) findViewById(R.id.catalogos);
        promo2 = (CardView) findViewById(R.id.promo);
        helpdesk2 = (CardView) findViewById(R.id.helpdesk);

        // Add click listener to the cards
        tabela_preços2.setOnClickListener(this);
        catalogos2.setOnClickListener(this);
        promo2.setOnClickListener(this);
        helpdesk2.setOnClickListener(this);
        logout = (Button) findViewById(R.id.btnLogout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logout();
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.tabela_preços:
                i = new Intent(this, Precos.class);
                startActivity(i);
                break;
            case R.id.catalogos:
                i = new Intent(this, Catalogos.class);
                startActivity(i);
                break;
            case R.id.promo:
                i = new Intent(this, ImagesActivity.class);
                startActivity(i);
                break;
            case R.id.helpdesk:
                i = new Intent(this, HelpDesk.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }



    private void Logout() {
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(SecondActivity.this, MainActivity.class));
    }


}
