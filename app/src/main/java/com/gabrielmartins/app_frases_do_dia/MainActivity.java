package com.gabrielmartins.app_frases_do_dia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Atributo
    String[] frases = {
            "Deus te ama",
            "Tenha Fé",
            "Deus é contigo",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textResultado);
        int numeroaleatorio = new Random().nextInt(3);
        String frase = frases [ numeroaleatorio ];

        texto.setText( frase );

    }
    public void exibirTodas(View view) {

        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";
        for (String frase : frases) {
            textoResultado = textoResultado + frase + "\n";
        }

        texto.setText( textoResultado );

    }
}