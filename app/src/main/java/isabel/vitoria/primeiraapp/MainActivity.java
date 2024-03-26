package isabel.vitoria.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { //classe que representa o sistema principal

    @Override
    protected void onCreate(Bundle savedInstanceState) { //cria funções
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //constroi a interface da tela

        Button btnEnviar = findViewById(R.id.btn_enviar); //obtem o botão enviar

        btnEnviar.setOnClickListener(new View.OnClickListener() { //configuração do botão
            @Override
            public void onClick(View v) { //obtem o clique do botão
                EditText etDigiteAqui = findViewById(R.id.et_digiteaqui); //obtem a caixa de texto
                String textoDigitado = etDigiteAqui.getText().toString(); //obtem o texto da caixa de texto

                Intent i = new Intent(MainActivity.this, NextActivity.class); //cria uma nova intenção

                i.putExtra("texto", textoDigitado); //chave e valor associado a chave

                startActivity(i); //executa a intenção declarada acima

                //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
            }
        });
    }
}