package com.example.manejodelintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edNombre;
    private EditText edPassword;
    private Button btnValidar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNombre=findViewById(R.id.tvNombre);
        edPassword=findViewById(R.id.tvPassword);




    }
    //esto se ejecutara al pulsar el boton, y el parametro (View v) indica el boton pulsado
    public void validarSaludo(View v){
        String nombre= this.edNombre.getText().toString();
        String clave = this.edPassword.getText().toString();

        if(nombre.equals("Ana")&& clave.equals("1234")) {
            //esto sirve para asociar el boton y que cambie al otro main
            Intent intent = new Intent(this, Saludo.class);
            
            ArrayList<String> nombres= new ArrayList<String>();
            nombres.add("Carlos");
            nombres.add("Juan");

            intent.putStringArrayListExtra("ClaveArrayNombres",nombres);
            intent.putExtra("ClaveNombre",nombre);
            intent.putExtra("ClavePassword", clave);

            startActivity(intent);
        }
    }
}