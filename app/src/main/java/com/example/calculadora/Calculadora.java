package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculadora extends AppCompatActivity {

    Button btnSoma, btnSubtracao, btnMultiplicacao, btnDivisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btnSoma = findViewById(R.id.btnSoma);
        btnSoma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent redirectSoma = new Intent(Calculadora.this, Adicao.class);
                startActivity(redirectSoma);
            }
        });


        btnSubtracao = findViewById(R.id.btnSubtracao);
        btnSubtracao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent redirectSubtracao = new Intent(Calculadora.this, Subtracao.class);
                startActivity(redirectSubtracao);
            }
        });

        btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        btnMultiplicacao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent redirectMultiplicacao = new Intent(Calculadora.this, Multiplicacao.class);
                startActivity(redirectMultiplicacao);
            }
        });

        btnDivisao = findViewById(R.id.btnDivisao);
        btnDivisao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent redirectDivisao = new Intent(Calculadora.this, Divisao.class);
                startActivity(redirectDivisao);
            }
        });
    }
}