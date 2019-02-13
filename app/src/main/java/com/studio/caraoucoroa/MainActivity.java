package com.studio.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView botao_jogar;
    private String[] opcao = {"cara","coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botao_jogar = findViewById(R.id.botao_jogar_id);

        botao_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Numero Randomico
                Random randomico = new Random();
                int numealeatorio = randomico.nextInt(2);

                //opcao(numealeatorio);
                Intent intent = new Intent(MainActivity.this,DetalheActivity.class  );

                intent.putExtra("opcao", opcao[numealeatorio]);
                startActivity(intent);
            }
        });

    }
}
