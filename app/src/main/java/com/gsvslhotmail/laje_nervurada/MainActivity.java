package com.gsvslhotmail.laje_nervurada;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    TabelasdeCoeficientes tabcoef = new TabelasdeCoeficientes();
     // Declaração das variáveis

     Spinner spinneraço;
     EditText edttxta;
     EditText edttxtb;
     EditText edttxtbf;
     EditText edttxtbw;
     EditText edttxthf;
     EditText edttxthw;
     EditText edttxtvaox;
     EditText edttxtvaoy;
     EditText edttxtpermanente, edttxtvariavel;
     EditText edttxtfck;
     Button btcalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinneraço = (Spinner) findViewById(R.id.spinneraço);


        edttxtvariavel = (EditText) findViewById(R.id.edttxtvariavel);
        edttxtpermanente = (EditText) findViewById(R.id.edttxtpermanente);
        edttxthw = (EditText) findViewById(R.id.edttxthw);
        edttxtbw = (EditText) findViewById(R.id.edttxtbw);
        edttxthf = (EditText) findViewById(R.id.edttxthf);
        edttxta = (EditText) findViewById(R.id.edttxta);
        edttxtb = (EditText) findViewById(R.id.edttxtb);
        edttxtbf = (EditText) findViewById(R.id.edttxtbf);
        edttxtfck = (EditText) findViewById(R.id.edttxtfck);
        edttxtvaox = (EditText) findViewById(R.id.edttxtvaox);
        edttxtvaoy = (EditText) findViewById(R.id.edttxtvaoy);
        btcalcular = (Button) findViewById(R.id.btcalcular);
        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vx = edttxtvaox.getText().toString();
                String vy = edttxtvaoy.getText().toString();
                String va = edttxta.getText().toString();
                String vb = edttxtb.getText().toString();
                String vbf = edttxtbf.getText().toString();
                String vbw = edttxtbw.getText().toString();
                String vhw = edttxthw.getText().toString();
                String vhf = edttxthf.getText().toString();
                String vfck = edttxtfck.getText().toString();
                String vperm = edttxtpermanente.getText().toString();
                String vvar = edttxtvariavel.getText().toString();

                if (vx.trim().isEmpty() || vy.trim().isEmpty() || va.trim().isEmpty()
                        || vb.trim().isEmpty() || vbf.trim().isEmpty() || vbw.trim().isEmpty()
                        || vhf.trim().isEmpty() || vhw.trim().isEmpty() || vperm.trim().isEmpty()
                        || vvar.trim().isEmpty() || vfck.trim().isEmpty()) {

                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setMessage("Há valores em branco");
                    dialogo.setNeutralButton("Ok", null);
                    dialogo.show();

                } else {

                    // Pega os valores digitados e transforma em Strings para serem usados no calculo

                    double valorx = Double.parseDouble(edttxtvaox.getText().toString());
                    double valory = Double.parseDouble(edttxtvaoy.getText().toString());
                    double valorfck = Double.parseDouble(edttxtfck.getText().toString());
                    double valora = Double.parseDouble(edttxta.getText().toString());
                    double valorb = Double.parseDouble(edttxtb.getText().toString());
                    double valorbw = Double.parseDouble(edttxtbw.getText().toString());
                    double valorhf = Double.parseDouble(edttxthf.getText().toString());
                    double valorbf = Double.parseDouble(edttxtbf.getText().toString());
                    double valorhw = Double.parseDouble(edttxthw.getText().toString());
                    double valorvariavel = Double.parseDouble(edttxtvariavel.getText().toString());
                    double valorpermanente = Double.parseDouble(edttxtpermanente.getText().toString());

                    double lambda = (valory/valorx);


                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setMessage("O resultado é: " + lambda);
                    dialogo.setNeutralButton("Ok", null);
                    dialogo.show();
                }
            }

        });
    }
}

