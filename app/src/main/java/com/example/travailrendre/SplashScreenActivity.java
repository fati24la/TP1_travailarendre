package com.example.travailrendre;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logo = findViewById(R.id.logo);

        // Créer une animation de rotation
        RotateAnimation rotate = new RotateAnimation(0, 180,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(5000); // Durée de l'animation en millisecondes
        rotate.setInterpolator(new LinearInterpolator());

        // Démarrer l'animation
        logo.startAnimation(rotate);

        // Créer un thread pour attendre la fin de l'animation et démarrer MainActivity
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000); // Attendre la fin de l'animation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Démarrer MainActivity
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Terminer l'activité actuelle
            }
        }).start();
    }
}