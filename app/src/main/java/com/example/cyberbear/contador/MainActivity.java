package com.example.cyberbear.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    public int contador;
    TextView textoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoResultado=findViewById(R.id.textoResultado);
        contador=0;

    }

   /* public void mostrar(){
        TextView testoResultado=findViewById(R.id.textoResultado);
        textoResultado.setText(""+contador);
    }*/

    public void incrementaContador(View vista){
        contador++;
        textoResultado.setText(""+contador);
    }

    public void restaContador(View vista){
        contador--;

        if(contador<0){
            CheckBox negativos=(CheckBox)findViewById(R.id.negativos);

            if(!negativos.isChecked()){contador=0;}
        }
        textoResultado.setText(""+contador);

    }

    public void resetContador(View vista){
        EditText numero_reset=findViewById(R.id.n_reseteo);
        try {
            contador = Integer.parseInt(numero_reset.getText().toString());
        }catch (Exception e){
            contador=0;
        }
        numero_reset.setText("");
        textoResultado.setText(""+contador);


    }


}