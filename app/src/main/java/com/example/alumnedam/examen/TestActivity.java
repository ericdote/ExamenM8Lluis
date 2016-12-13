package com.example.alumnedam.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import test.Test;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {
    int contador = 0;
    int preguntes, nuM1, nuM2, tema;
    String cadena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        String nom = getIntent().getStringExtra("nom");
        tema = getIntent().getIntExtra("tema", -33);
        preguntes = getIntent().getIntExtra("preguntes", -33);
        Test test = new Test();
        TextView num1 = (TextView) findViewById(R.id.tvNum1);
        TextView num2 = (TextView) findViewById(R.id.tvNum2);
        TextView calc = (TextView) findViewById(R.id.tvCalcul);
        int[] nums = new int[2];
        nums = test.llistaPreguntes(tema);
        nuM1 = nums[0];
        nuM2 = nums[1];
        String cadena1, cadena2;
        cadena1 = String.valueOf(nuM1);
        cadena2 = String.valueOf(nuM2);
        num1.setText(cadena1);
        num2.setText(cadena2);
        switch (tema){
            case 1:
                calc.setText("+");
                break;
            case 2:
                calc.setText("-");
                break;
            case 3:
                calc.setText("*");
                break;
            case 4:
                calc.setText("/");
                break;
        }
        Button btnSeguent = (Button)findViewById(R.id.btnSeguent);
        btnSeguent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnSeguent){
            EditText reusltat = (EditText)findViewById(R.id.etResposta);
            String res = reusltat.getText().toString();
            int resposta;
            resposta = Integer.parseInt(res);
            TextView tvEncerts = (TextView) findViewById(R.id.tvEncerts);
            TextView tvFalls = (TextView) findViewById(R.id.tvFalls);

            int mLN = Integer.valueOf(tvEncerts.getText().toString());
            switch (tema){
                case 1:
                    if (resposta == (nuM1 + nuM2)){
                        Toast.makeText(this, "Okay", Toast.LENGTH_SHORT).show();
                        cadena = "1";
                        contador++;
                        tvEncerts.setText(cadena);
                    } else {
                        cadena = "1";
                        contador++;
                        tvFalls.setText(cadena);
                    }
                    break;
                case 2:
                    if (resposta == (nuM1 - nuM2)){
                        Toast.makeText(this, "Okay", Toast.LENGTH_SHORT).show();
                        cadena = "1";
                        contador++;
                        tvEncerts.setText(cadena);
                    } else {
                        cadena = "1";
                        contador++;
                        tvFalls.setText(cadena);
                    }
                    break;
                case 3:
                    if (resposta == (nuM1 * nuM2)){
                        Toast.makeText(this, "Okay", Toast.LENGTH_SHORT).show();
                        cadena = "1";
                        contador++;
                        tvEncerts.setText(cadena);
                    } else {
                        cadena = "1";
                        contador++;
                        tvFalls.setText(cadena);
                    }
                    break;
                case 4:
                if (resposta == (nuM1 / nuM2)){
                    Toast.makeText(this, "Okay", Toast.LENGTH_SHORT).show();
                    cadena = "1";
                    contador++;
                    tvEncerts.setText(cadena);
                } else {
                    cadena = "1";
                    contador++;
                    tvFalls.setText(cadena);
                }
            }
        }
    }
}
