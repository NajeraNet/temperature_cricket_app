package com.example.temperature_cricket;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//  Se declaran las variables
    EditText etChirps;
    Button btnSubmit;
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      Here is where the magic start
        //Asignamos a variables
        etChirps = findViewById(R.id.etChirps);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResults = findViewById(R.id.tvResults);

//      Removemos la vista al iniciar
        tvResults.setVisibility(View.GONE);

        btnSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View TempOut) {

//              Obtenemos el numero de chirridos
                int nChirps = Integer.parseInt((etChirps.getText().toString()));

//              Los dividimos entre 3 y le sumamos 4
                int result = nChirps / 3 + 4;

//              Los convertimos como string
                String textview = getString(R.string.tvDescFin) + " " + String.valueOf(result);

//              Los pasamos a tvResult
                tvResults.setText(textview);
//
//              Traemos la vista de regreso para mostrar los resultados
                tvResults.setVisibility(View.VISIBLE);
            }
        });
    }
}
