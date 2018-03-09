package com.example.tequila.calculadorasencilla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText txtnum1, txtmun2;
TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buscando documentos
        txtnum1=(EditText) findViewById(R.id.ednum1);
        txtmun2=(EditText) findViewById(R.id.ednum2);
        resultado=(TextView) findViewById(R.id.textresultado);
    }
    //metodo onClick
    public void doSum(View v){
     int num1=Integer.parseInt(txtnum1.getText().toString());
        int num2=Integer.parseInt(txtnum1.getText().toString());
        int resultado= num1 + num2;
        this.resultado.setText(""+ resultado);
    }
    public void doRes(View v){
        int num1=Integer.parseInt(txtnum1.getText().toString());
        int num2=Integer.parseInt(txtnum1.getText().toString());
        int resultado= num1 - num2;
        this.resultado.setText(""+ resultado);
}
    public void doMulti(View v){
        int num1=Integer.parseInt(txtnum1.getText().toString());
        int num2=Integer.parseInt(txtnum1.getText().toString());
        int resultado= num1 * num2;
        this.resultado.setText(""+ resultado);
    }
    public void doDivi(View v){
        int num1=Integer.parseInt(txtnum1.getText().toString());
        int num2=Integer.parseInt(txtnum1.getText().toString());
        int resultado= num1 / num2;
        this.resultado.setText(""+ resultado);
    }
    }