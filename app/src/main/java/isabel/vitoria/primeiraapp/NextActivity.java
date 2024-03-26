package isabel.vitoria.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent i = getIntent(); //recebe o intent da outra tela

        String textoDigitado = i.getStringExtra("texto"); //
    }
}