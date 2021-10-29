package com.example.manejodelintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Saludo extends AppCompatActivity {

    private TextView tvSaludo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        tvSaludo=findViewById(R.id.tvSaludo);

        String nombre = getIntent().getStringExtra("ClaveNombre");
        String clave = getIntent().getStringExtra("ClavePassword");
        ArrayList<String> n = getIntent().getStringArrayListExtra("ClaveArrayNombres");

        Toast.makeText(this,"El primero nombre es: "+n.get(1).toString(),Toast.LENGTH_LONG);

        if (clave.equals("1234")) {
            tvSaludo.setText("Hola " + nombre + " su contraseña es: " + clave);
        }else{
            this.tvSaludo.setText("Intruso...");
        }

    }
}