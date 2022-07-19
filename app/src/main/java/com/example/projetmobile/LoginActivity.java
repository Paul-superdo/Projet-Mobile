package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private Button boutonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText edMatricule = findViewById(R.id.editTextMatricule);
        EditText edPassword = findViewById(R.id.editTextMdps);

        boutonLogin = findViewById(R.id.btn_login);
        progressBar = findViewById(R.id.progress_bar);

        boutonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricule = edMatricule.getText().toString();
                String password = edPassword.getText().toString();

                if(matricule.isEmpty()){
                    Toast.makeText(
                            LoginActivity.this,"le matricule ne doit pas etre vide",
                            Toast.LENGTH_LONG
                    ).show();
                }
                else if (password.isEmpty()){
                    Toast.makeText(
                            LoginActivity.this,"le mot de passe ne doit pas etre vide",
                            Toast.LENGTH_LONG
                    ).show();
                }
                else {
                    login(matricule, password);
                }
            }
        });
    }
    private void login(String matricule, String password){
        progressBar.setVisibility(View.VISIBLE); //visibilite du progressebar
        boutonLogin.setEnabled(false); //le clique du bouton

        SharedPreferences session = getSharedPreferences("session",0);
        session.edit().putBoolean("sessionActive",true).apply();

    }
}