package com.example.travailrendre;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView nomEtPrenom ,email,phone,adresse,ville ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        nomEtPrenom=findViewById(R.id.nom);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        adresse=findViewById(R.id.adresse);
        ville=findViewById(R.id.ville);
        nomEtPrenom.setText(getIntent().getStringExtra("nomPrenomKey"));
        email.setText(getIntent().getStringExtra("emailKey"));
        phone.setText(getIntent().getStringExtra("phoneKey"));
        adresse.setText(getIntent().getStringExtra("adresseKey"));
        ville.setText(getIntent().getStringExtra("villeKey"));
    }
}
