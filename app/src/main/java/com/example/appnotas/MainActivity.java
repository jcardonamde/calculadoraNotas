package com.example.appnotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, n1, n2, n3;
    private TextView prom;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            nombre = (EditText) findViewById(R.id.nombre);
            n1 = (EditText) findViewById(R.id.nota1);
            n2 = (EditText) findViewById(R.id.nota2);
            n3 = (EditText) findViewById(R.id.nota3);
            prom = (TextView) findViewById(R.id.prom);
            calcular = (Button) findViewById(R.id.btnCalcular);

            calcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    float suma = 0f, promedio = 0f;
                    float num1, num2, num3;
                    num1 = Float.parseFloat(n1.getText().toString());
                    num2 = Float.parseFloat(n2.getText().toString());
                    num3 = Float.parseFloat(n3.getText().toString());
                    suma = num1 + num2 + num3;
                    promedio = suma / 3f;
                    prom.setText(String.valueOf("PROMEDIO: " + promedio));
                }
            });

    }
}