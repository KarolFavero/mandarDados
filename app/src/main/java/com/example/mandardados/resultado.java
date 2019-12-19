package com.example.mandardados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    //declara atributos que vão receber os campos
    public TextView resultnome;
    public TextView resultEmail;
    public TextView resultData;
    public TextView resultTelefone;
    public TextView resultMensagem;
    public TextView resultSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        //verifica se foram passados parâmetros na tela
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){

            //pega os valores passados pela tela
            String nome = bundle.getString("nome");
            String email = bundle.getString("email");
            String data = bundle.getString("data");
            String telefone = bundle.getString("telefone");
            String mensagem = bundle.getString("mensagem");
            String senha = bundle.getString("senha");

            //busca o campo na activity e adiciona o texto vindo de outra tela a ele
            resultnome = findViewById(R.id.resultNome);
            resultnome.setText(nome);

            resultEmail = findViewById(R.id.resultEmail);
            resultEmail.setText(email);

            resultData = findViewById(R.id.resultData);
            resultData.setText(data);

            resultTelefone = findViewById(R.id.resultTelefone);
            resultTelefone.setText(telefone);

            resultMensagem = findViewById(R.id.resultMensagem);
            resultMensagem.setText(mensagem);

            resultSenha = findViewById(R.id.resultSenha);
            resultSenha.setText(senha);
        }
    }

    public void voltar(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}