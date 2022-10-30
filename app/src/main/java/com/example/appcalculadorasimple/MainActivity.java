package com.example.appcalculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Suma(View vista){
        // Hacemos la conexion con los EditBox
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);
        // Accedemos al texto de los dos primeros EditBox
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int resultado = n1 + n2;
        et3.setText("Resultado suma "+resultado);
    }

    public void Resta(View vista){
        // Hacemos la conexion con los EditBox
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);
        // Accedemos al texto de los dos primeros EditBox
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int resultado = n1 - n2;
        et3.setText("Resultado restar "+resultado);
    }

    public void Multiplica(View vista){
        // Hacemos la conexion con los EditBox
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);
        // Accedemos al texto de los dos primeros EditBox
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int resultado = n1 * n2;
        et3.setText("Resultado multiplicar "+resultado);
    }

    public void Divide(View vista){
        // Hacemos la conexion con los EditBox
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);
        // Accedemos al texto de los dos primeros EditBox
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int resultado = n1 / n2;
        et3.setText("Resultado dividir "+resultado);
    }
}