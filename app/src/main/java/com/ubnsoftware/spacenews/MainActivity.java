package com.ubnsoftware.spacenews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    // Duración del splash screen en milisegundos
    private static final int SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        // Duración del splash screen en milisegundos
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                // Este método se ejecutará una vez que transcurra el tiempo definido
                // y nos llevará a la actividad principal
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
                finish(); // Cerrar la actividad actual
            }
        },SPLASH_DURATION);
    }
}