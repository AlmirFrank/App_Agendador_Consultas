package com.example.agendamentomedico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    private EditText etPaciente;
    private EditText etData;
    private EditText etMedico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        etPaciente = findViewById(R.id.etPaciente);
        etData = findViewById(R.id.etData);
        etMedico = findViewById(R.id.etMedico);
    }

    public void Buscar(View view) {

//        boolean res = false;

        String etP = etPaciente.getText().toString();
        String etD = etData.getText().toString();
        String etM = etMedico.getText().toString();
//        String etH = null;
//        String etC = null;
//        String etE = null;

//        if (isCampoVazio(etP)) {
//            etPaciente.requestFocus();
//            res = true;
//        }
//        else
//            if (isCampoVazio(etD)) {
//                etData.requestFocus();
//                res = true;
//            }
//            else
//                if (isCampoVazio(etM)) {
//                    etMedico.requestFocus();
//                    res = true;
//                }
//
//        if (res) {
//
//            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
//            dlg.setTitle("Aviso!");
//            dlg.setMessage("Há campos vazios!");
//            dlg.setNeutralButton("OK", null);
//            dlg.show();
//        }

        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);

//        Bundle parametros = new Bundle();
////
////        parametros.putString("paciente", etP);
////        parametros.putString("medico", etM);
////        parametros.putString("data", etD);
////        parametros.putString("hora", etH);
////        parametros.putString("celular", etC);
////        parametros.putString("email", etE);
////
////        intent.putExtras(parametros);

    }

//    private boolean isCampoVazio(String valor) {
//
//        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty() );
//        return resultado;
//    }

}