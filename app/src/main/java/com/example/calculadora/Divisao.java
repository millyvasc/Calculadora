package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Divisao extends AppCompatActivity {

    EditText input1, input2, input3;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisao);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1Valor = input1.getText().toString();
                String input2Valor = input2.getText().toString();

                if (TextUtils.isEmpty(input1Valor)) {
                    input1Valor = "0";
                }
                if (TextUtils.isEmpty(input2Valor)) {
                    input2Valor = "0";
                }

                float resultado = Float.parseFloat(input1Valor) / Float.parseFloat(input2Valor);
                input3.setText(String.valueOf(resultado));
            }
        });
    }
}