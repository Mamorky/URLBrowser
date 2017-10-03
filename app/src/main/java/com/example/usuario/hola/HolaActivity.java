package com.example.usuario.hola;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class HolaActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nombre,url;
    Button saludar,navegar;
    Intent intent;
    Intent intSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola);

        nombre = (EditText)findViewById(R.id.edtNombre);
        url = (EditText)findViewById(R.id.edtURL);
        saludar = (Button)findViewById(R.id.btnSaludar);
        saludar.setOnClickListener(this);
        navegar = (Button)findViewById(R.id.btnNavegar);
        navegar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == saludar){
            intSaludo = new Intent(this,SaludaActivity.class);
            intSaludo.putExtra("nombre",nombre.getText().toString());
            startActivity(intSaludo);
        }
        else if(view == navegar){
            openWebPage(url.getText().toString());
        }
    }

    public void openWebPage(String url)
    {
        Uri webpage = Uri.parse(url);

        intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
