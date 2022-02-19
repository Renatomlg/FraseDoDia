package com.regape.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.RandomAccessFile;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // metodo pra gera as frases
 public void gerarNovaFrase(View view){
// cria um arrray para armazema as frases
        String [] frases = {
                "O importante não é vencer todos os dias, mas lutar sempre",
                "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
                "É melhor conquistar a si mesmo do que vencer mil batalhas",
                "Quem ousou conquistar e saiu pra lutar, chega mais longe!",
                "Enquanto houver vontade de lutar haverá esperança de vencer."
        };
        // cria uma variavél para receber o numero da aleatorio Random
      int numero = new Random().nextInt(4); // gera 0 1 2 3 4

     TextView texto = findViewById(R.id.textResultado);
     texto.setText( frases [numero] );


 }
                
}