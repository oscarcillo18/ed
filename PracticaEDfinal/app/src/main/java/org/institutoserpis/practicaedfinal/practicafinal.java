package org.institutoserpis.practicaedfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class practicafinal extends AppCompatActivity implements View.OnClickListener {
    EditText numero1, numero2;
    Button suma, resta, div, mult;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicafinal);

        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        suma = (Button) findViewById(R.id.suma);
        resta = (Button) findViewById(R.id.resta);
        div = (Button) findViewById(R.id.div);
        mult = (Button) findViewById(R.id.mult);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        div.setOnClickListener(this);
        mult.setOnClickListener(this);

        resultado = (TextView) findViewById(R.id.resultado);

    }

    @Override
    public void onClick(View v) {

        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);

        int rta=0;

        switch (v.getId()) {
            case R.id.suma:
                rta=entero1+entero2;
                break;
            case R.id.resta:
                rta=entero1-entero2;
                break;
            case R.id.div:
                rta=entero1/entero2;
                break;
            case R.id.mult:
                rta=entero1*entero2;
                break;
        }
        resultado.setText(""+rta);
    }

    }

