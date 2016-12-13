package com.example.alumnedam.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import test.Test;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCallActivity = (Button) findViewById(R.id.btnComenca);
        btnCallActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnComenca) {
            Intent intent = new Intent(this, TestActivity.class);
            EditText etNom = (EditText) findViewById(R.id.etNom);
            RadioGroup rgT = (RadioGroup) findViewById(R.id.rgTema);
            RadioGroup rgD = (RadioGroup) findViewById(R.id.rgDif);
            int preguntes = 5;

            if (etNom.getText().toString().equals("")) {
                Toast.makeText(this, "Introdueix valors", Toast.LENGTH_LONG).show();
            } else {
                switch (rgD.getCheckedRadioButtonId()) {
                    case R.id.rb5:
                        preguntes = 5;
                        break;
                    case R.id.rb10:
                        preguntes = 10;
                        break;
                    case R.id.rb15:
                        preguntes = 15;
                        break;
                    case R.id.rb20:
                        preguntes = 20;
                        break;
                    default:
                        Toast.makeText(this, "Marca un numero de preguntes", Toast.LENGTH_SHORT).show();
                }
                switch (rgT.getCheckedRadioButtonId()) {
                    case R.id.rbSuma:
                        intent.putExtra("nom", etNom.getText().toString());
                        intent.putExtra("tema", 1);
                        intent.putExtra("preguntes", preguntes);
                        break;
                    case R.id.rbResta:
                        intent.putExtra("nom", etNom.getText().toString());
                        intent.putExtra("tema", 2);
                        intent.putExtra("preguntes", preguntes);
                        break;
                    case R.id.rbMultiplicacio:
                        intent.putExtra("nom", etNom.getText().toString());
                        intent.putExtra("tema", 3);
                        intent.putExtra("preguntes", preguntes);
                        break;
                    case R.id.rbDivisio:
                        intent.putExtra("nom", etNom.getText().toString());
                        intent.putExtra("tema", 4);
                        intent.putExtra("preguntes", preguntes);
                        break;
                    default:
                        Toast.makeText(this, "Marca un tema", Toast.LENGTH_SHORT).show();
                }
                startActivity(intent);
            }
        }
    }
}
