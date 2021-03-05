package com.example.comparativo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPreconaSteam, editPreconaEpic;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPreconaSteam = findViewById(R.id.item1);
        editPreconaEpic = findViewById(R.id.item2);
        textResultado = findViewById(R.id.Resultado);
    }

    public void CalcularPreco(View view) {
        //recuperar valoraes digitados*

        String PreconaSteam = editPreconaSteam.getText( PreconaSteam );
        String PreconaEpic = editPreconaSteam.getText( PreconaEpic );

        Boolean camposValidados = validarCampos(PreconaSteam, PreconaEpic);
        if (camposValidados){

            //Converter string para número
            Double ValorSteam = Double.parseDouble(PreconaSteam);
            Double ValorEpic = Double.parseDouble(PreconaEpic);

            Double resultado = ValorSteam / ValorEpic
            if(resultado >= 0.7){
                textResultado.setText("Melhor compra na Steam");
            }else{
                textResultado.setText("Melhor compra na Epic");

            }
        }
        public Boolean validarCampos( String pSteam, String pEpic)

            Boolean camposValidados = true;

            if(pSteam == null) ||PreconaSteam.equals(""){
              camposValidados = false;
        }else if (pEpic == null) ||PreconaEpic.equals(""){
              camposValidados = false;
        }

          return camposValidados;
        }
    }
}