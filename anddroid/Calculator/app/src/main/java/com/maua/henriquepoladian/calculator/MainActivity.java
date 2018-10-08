package com.maua.henriquepoladian.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtVal1;
    private EditText edtVal2;
    private TextView txtVal;
    private Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v){
        this.edtVal1 = (EditText) findViewById(R.id.edtVal1);
        this.edtVal2 = (EditText) findViewById(R.id.edtVal2);
        this.txtVal = (TextView) findViewById(R.id.txtVal);
        try {
            Double edtValor1 = Double.parseDouble(this.edtVal1.getText().toString());
            Double edtValor2 = Double.parseDouble(this.edtVal2.getText().toString());
            switch (v.getId()) {
                case R.id.btnDiv:
                    this.result = edtValor1 / edtValor2;
                    break;

                case R.id.btnMult:
                    this.result = edtValor1 * edtValor2;
                    break;

                case R.id.btnSom:
                    this.result = edtValor1 + edtValor2;
                    break;

                case R.id.btnSub:
                    this.result = edtValor1 - edtValor2;
                    break;
            }
            this.txtVal.setText(this.result.toString());
        }catch (Exception e){
            Toast.makeText(this, "Voce digitou um valor invalido!\n"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }









}
