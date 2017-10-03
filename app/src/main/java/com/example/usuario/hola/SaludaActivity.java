package com.example.usuario.hola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludaActivity extends AppCompatActivity {

    TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saluda);
        saludo = (TextView)findViewById(R.id.txvSaludo);

        Intent intSaludo = this.getIntent();
        saludo.setText("Hola "+intSaludo.getStringExtra("nombre"));
    }
}
