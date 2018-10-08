package com.maua.henriquepoladian.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtNome;
    private TextView txtNome;
    private ImageView imgNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void apertar(View view){
        this.txtNome = (TextView) findViewById(R.id.txtNome);
        this.edtNome = (EditText) findViewById(R.id.edtNome);
        this.imgNome = (ImageView) findViewById(R.id.imgNome);
        float valorAtual = this.imgNome.getRotation();
        this.imgNome.setRotation(valorAtual + 90);
        this.txtNome.setText(this.edtNome.getText());
    }
}
