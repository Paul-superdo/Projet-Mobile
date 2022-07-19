package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        //Modification des element de la sessoin
        //session.edit()
        //        .putInt("sessionId",123)
         //       .putBoolean("sessionActive",true)
         //       .apply();
    }
}