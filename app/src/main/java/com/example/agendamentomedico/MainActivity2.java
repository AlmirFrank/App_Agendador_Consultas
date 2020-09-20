package com.example.agendamentomedico;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText etNome;
    private EditText etData;
    private EditText etHora;
    private EditText etMedico;
    private EditText etCelular;
    private EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etNome = findViewById(R.id.etNome);
        etData = findViewById(R.id.etData);
        etHora = findViewById(R.id.etHora);
        etMedico = findViewById(R.id.etMedico);
        etCelular = findViewById(R.id.etCelular);
        etEmail = findViewById(R.id.etEmail);

    }

    public void MarcarConsulta (View view) {

        boolean res = false;

        String etN = etNome.getText().toString();
        String etD = etData.getText().toString();
        String etH = etHora.getText().toString();
        String etM = etMedico.getText().toString();
        String etC = etCelular.getText().toString();
        String etE = etEmail.getText().toString();

        if (isCampoVazio(etN)) {
            etNome.requestFocus();
            res = true;
        }
        else
        if (isCampoVazio(etD)) {
            etData.requestFocus();
            res = true;
        }
        else
        if (isCampoVazio(etH)) {
            etHora.requestFocus();
            res = true;
        }
        else
        if (isCampoVazio(etM)) {
            etMedico.requestFocus();
            res = true;
        }
        else
        if (isCampoVazio(etC)) {
            etCelular.requestFocus();
            res = true;
        }

        if (res) {

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Aviso!");
            dlg.setMessage("Há campos vazios!");
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }

    }

    private boolean isCampoVazio(String valor) {

        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty() );
        return resultado;
    }

}