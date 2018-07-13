package com.example.itmaster.ejercicio_layout_completo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button peliculas1,peliculas2,peliculas3,peliculas4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peliculas1 = findViewById(R.id.peliculas1);
        peliculas2 = findViewById(R.id.peliculas2);
        peliculas3 = findViewById(R.id.peliculas3);
        peliculas4 = findViewById(R.id.peliculas4);

        peliculas1.setText("VOLVER AL FUTURO");
        peliculas2.setText("VOLVER AL FUTURO 2");
        peliculas3.setText("VOLVER AL FUTURO 3");
        peliculas4.setText("ALIEN");
    }
}
