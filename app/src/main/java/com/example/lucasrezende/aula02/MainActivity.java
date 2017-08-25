package com.example.lucasrezende.aula02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResultado;
    private EditText edtValor1;
    private EditText edtValor2;
    private Button btnSoma;
    private Button btnSubtrai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtResultado = (TextView) findViewById(R.id.TxtResultado);
        edtValor1 = (EditText) findViewById(R.id.editText1);
        edtValor2 = (EditText) findViewById(R.id.editText2);
        btnSoma = (Button) findViewById(R.id.BtnSoma);
        btnSubtrai = (Button) findViewById(R.id.BtnSubtrai);

        Ouvinte ouvinte = new Ouvinte();
        btnSoma.setOnClickListener(ouvinte);
        btnSubtrai.setOnClickListener(ouvinte);

        txtResultado.setText("Entre com os valores para operação...");
    }


private class Ouvinte implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            int valor1 =  Integer.parseInt(edtValor1.getText().toString());
            int valor2 =  Integer.parseInt(edtValor2.getText().toString());
            txtResultado.setText("Resposta: " + (valor1 + valor2));
        }
    }
}
