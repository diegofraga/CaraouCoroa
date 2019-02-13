package com.studio.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView Moeda;
    private ImageView botao_voltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);


        Moeda = findViewById(R.id.moeda_id);
        botao_voltar= findViewById(R.id.botao_voltar_id);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            String opcaoEscolhida = extra.getString("opcao");
            if(opcaoEscolhida.equals("cara")){
                Moeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_cara));
            }else{
                Moeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
            }
        }


        botao_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(DetalheActivity.this,MainActivity.class)   );


            }
        });

    }
}
