package com.example.usuario.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends Activity implements View.OnClickListener {
    Button boton;
    TextView texto;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            boton = (Button) findViewById(R.id.button);
            texto = (TextView) findViewById(R.id.textView);
            boton.setOnClickListener(this);
            Actualizar();
        }

    @Override
    public void onClick(View v) {
        if(v == boton)
            Actualizar();
    }

    private void Actualizar(){
            texto.setText(new Date().toString());
    }
}
