package com.example.temperature_cricket;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

//  Se declaran las variables
    EditText etChirps;
    Button btnSubmit;
    TextView tvResults;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      Here is where the magic start
        //Asignamos a variables
        etChirps = findViewById(R.id.etChirps);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResults = findViewById(R.id.tvResults);
//
//      Removemos la vista al iniciar
        tvResults.setVisibility(View.GONE);
//
        formatter = new DecimalFormat("#0.0");
//
        btnSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View TempOut) {
//              Version corregida y aumentada ;)
//              Revisamos si el usuario no ha escrito algo en el campo de texto
                if (etChirps.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "¡Llena todos los campos!", Toast.LENGTH_SHORT).show();
                } else {
//                  Obtenemos y convertimos el numero de chirridos de una y lo almacenamos en la variable entera chirps
                    int chirps = Integer.parseInt(etChirps.getText().toString().trim());
//                  Calculamos la temperatura y la agregamos a la variable temp
                    double temp = (chirps / 3.0) + 4;
//                  Pasamos los resultados a unn String
                    String results = "La temperatura aproximada es de " + formatter.format(temp) + " grados celcius";
//                  mostramos los resultados
                    tvResults.setText(results);
                }
/*              Obtenemos el numero de chirridos
                int nChirps = Integer.parseInt((etChirps.getText().toString()));

//              Los dividimos entre 3 y le sumamos 4
                int result = nChirps / 3 + 4;

//              Los convertimos como string
                String textview = getString(R.string.tvDescFin) + " " + String.valueOf(result);

//              Los pasamos a tvResult
                tvResults.setText(textview);
//
//              Traemos la vista de regreso para mostrar los resultados

 */
                tvResults.setVisibility(View.VISIBLE);
            }
        });
    }
}
