package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ModifierProfilActivity extends AppCompatActivity {

    private EditText editTextAncien;
    private EditText editTextNouveau;
    private EditText editTextConfirmer;
    private Button btnModifier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_profil);

        Intent intentOmeActivity = new Intent(this,HomePageActivity.class);
        initialiserComposant();

        btnModifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ancien  = editTextAncien.getText().toString();
                String Nouveau  = editTextNouveau.getText().toString();
                String Confirmer  = editTextConfirmer.getText().toString();

                if(Ancien.equals("19kk141")) {
                    if(Nouveau.length() < 6){
                        Toast.makeText(ModifierProfilActivity.this, "entre un mdps valide", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if(Nouveau.equals(Confirmer)){
                            startActivity(intentOmeActivity);
                            finish();
                        }else {
                            Toast.makeText(ModifierProfilActivity.this, "les deux mot de passe doivent correspondre", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                else {
                    Toast.makeText(ModifierProfilActivity.this, "entre l'ancien mot de passe", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    private void initialiserComposant(){
        editTextAncien = findViewById(R.id.editTextMdps1);
        editTextNouveau = findViewById(R.id.editTextMdps2);
        editTextConfirmer = findViewById(R.id.editTextMdps3);
        btnModifier = findViewById(R.id.btnModif);

    }
}