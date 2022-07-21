package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {

    Button btnAjout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Accueil");

        verifierSession();
        configurerButtonAjout();
        configurerButtonListe();
        configurerButtonProfile();
    }
    private void verifierSession(){
        //creation de la sessoin
        SharedPreferences session = getSharedPreferences("session",0);
        //recuperation de la session
        boolean sessionActive = session.getBoolean("sessionActive",false);
        //int userId = session.getInt("session",-1);

        //si la session n'est pas active
        if (!sessionActive){
            Intent loginIntent = new Intent(this,LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }
    }
    private void configurerButtonAjout(){
        btnAjout = findViewById(R.id.btn_Ajout);
        Intent intentAjout = new Intent(this,AjouteTravailActivity.class);

        btnAjout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentAjout);
            }
        });
    }
    private  void configurerButtonListe(){
        Button btnListe = findViewById(R.id.btn_liste);
        Intent intentListe = new Intent(this,ListeTravailActivity.class);

        btnListe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentListe);
            }
        });
    }
    private void configurerButtonProfile(){
        Button btnProfile = findViewById(R.id.btnProfil);
        Intent intentProfil = new Intent(this,ProfilActivity.class);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentProfil);
            }
        });
    }
}