package com.roghersoares.userregistrationapp;

//Importações de componentes de UI, intenções e a biblioteca
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ReportActivity  extends AppCompatActivity {
    //Campo de texto onde os dados do banco serão exibidos no usages
    private TextView textViewReport;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //Define o Layout XML dessa tela de relatório
        setContentView(R.layout.activity_report);
        //MApeamento do TextView do XML para o Java
        textViewReport = findViewById(R.id.textViewReport);
        //encontra o botão e define o clique para voltar
        Button btnVoltar = findViewById(R.id.btnVoltar);
        //O botão de retorno utilizando expressão lambda
        btnVoltar.setOnClickListener(v -> voltarParaCadastro());

    }
}
