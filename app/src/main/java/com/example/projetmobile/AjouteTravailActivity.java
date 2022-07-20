package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class AjouteTravailActivity extends AppCompatActivity {

    private EditText editTextDescription;
    private EditText editTextCategorie;
    private EditText editTextPromotion;
    private EditText editTextDate;
    private TextView textViewPhoto;
    private Button btnAjouterPhoto;
    private Button btnAjoutetravail;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajoutetravail);

        Intent intentHomeActivity = new Intent(this,HomePageActivity.class);
        initialiserComposant();
        btnAjoutetravail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = editTextDescription.getText().toString();
                String categorie = editTextCategorie.getText().toString();
                String promotion = editTextPromotion.getText().toString();
                String date = editTextDate.getText().toString();

                if (description.isEmpty()){
                    Toast.makeText(AjouteTravailActivity.this, "veillez rensegne ce champ", Toast.LENGTH_SHORT).show();
                }
                else if (categorie.isEmpty()){
                    Toast.makeText(AjouteTravailActivity.this, "veillez rensegne ce champ", Toast.LENGTH_SHORT).show();
                }
                else if (promotion.isEmpty()){
                    Toast.makeText(AjouteTravailActivity.this, "veillez rensegne ce champ", Toast.LENGTH_SHORT).show();
                }
                else if (date.isEmpty()){
                    Toast.makeText(AjouteTravailActivity.this, "veillez rensegne ce champ", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(intentHomeActivity);
                }
            }
        });

    }
    private void initialiserComposant(){
        editTextDescription = findViewById(R.id.edit_description);
        editTextCategorie = findViewById(R.id.edit_categorie);
        editTextPromotion = findViewById(R.id.edit_Promotion);
        editTextDate = findViewById(R.id.edit_dateTravail);
        textViewPhoto = findViewById(R.id.textviewPhoto);
        btnAjouterPhoto = findViewById(R.id.btn_Ajout);
        btnAjoutetravail = findViewById(R.id.btn_Modifier);
        progressBar = findViewById(R.id.progress_bar);
    }
}